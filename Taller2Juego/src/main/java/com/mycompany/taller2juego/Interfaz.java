package com.mycompany.taller2juego;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Interfaz extends JFrame {

    private JLabel labelNombreLugar;
    private JLabel labelFechaHora;
    private JLabel labelImagen;
    private JTextArea areaTexto;
    private Clip clip;
    private boolean sonidoActivo = true;
    private List<JButton> botonesCiudades = new ArrayList<>();
    private List<JButton> botonesVisitados = new ArrayList<>();
    private Point startPoint;
    private Point endPoint;
    private Timer animationTimer;
    private double currentPosition;

    public Interfaz() {
        // Configurar la ventana
        setTitle("Carmen Sandiego: Aventura en Uruguay");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear barra de menú
        JMenuBar menuBar = createMenuBar();
        setJMenuBar(menuBar);

        // Crear panel superior
        JPanel panelSuperior = new JPanel(new BorderLayout());
        labelNombreLugar = new JLabel("Colonia del Sacramento", SwingConstants.CENTER);
        labelNombreLugar.setFont(new Font("Serif", Font.BOLD, 24));
        labelFechaHora = new JLabel("Lunes, 4 p.m.", SwingConstants.CENTER);
        labelFechaHora.setFont(new Font("Serif", Font.PLAIN, 18));
        panelSuperior.add(labelNombreLugar, BorderLayout.NORTH);
        panelSuperior.add(labelFechaHora, BorderLayout.SOUTH);

        // Crear panel central con GridLayout
        JPanel panelCentral = new JPanel(new GridLayout(1, 2));
        labelImagen = new JLabel(new ImageIcon("imagenes/Colsacra.png"), SwingConstants.CENTER);
        labelImagen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        areaTexto = new JTextArea("Información del Lugar Aquí");
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setEditable(false);
        panelCentral.add(labelImagen);
        panelCentral.add(new JScrollPane(areaTexto));

        // Crear panel inferior con FlowLayout
        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JButton botonVisitar = new JButton(new ImageIcon("imagenes/botones/BuscarCiudades.jpg"));
        JButton botonMapa = new JButton(new ImageIcon("imagenes/botones/Avion.png"));
        JButton botonBuscarCriminal = new JButton(new ImageIcon("imagenes/botones/Criminal.jpg"));
        JButton botonCerrar = new JButton("Cerrar");
        Dimension buttonSize = new Dimension(50, 50);
        botonVisitar.setPreferredSize(buttonSize);
        botonMapa.setPreferredSize(buttonSize);
        botonBuscarCriminal.setPreferredSize(buttonSize);
        botonCerrar.setPreferredSize(buttonSize);
        panelInferior.add(botonVisitar);
        panelInferior.add(botonMapa);
        panelInferior.add(botonBuscarCriminal);
        panelInferior.add(botonCerrar);

        // Añadir acción al botón "Cerrar"
        botonCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int respuesta = JOptionPane.showConfirmDialog(
                        null,
                        "¿Está seguro de que desea salir?",
                        "Confirmar salida",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE
                );
                if (respuesta == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        // Añadir acción al botón "Mapa"
        botonMapa.addActionListener(e -> mostrarMapa());

        // Añadir paneles a la ventana
        setLayout(new BorderLayout());
        add(panelSuperior, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        // Hacer visible la ventana
        setVisible(true);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuJuego = new JMenu("Juego");
        JMenuItem itemCreditos = new JMenuItem("Créditos");
        JMenuItem itemRanking = new JMenuItem("Ranking");
        JMenuItem itemNuevoJuego = new JMenuItem("Nuevo Juego");
        menuJuego.add(itemCreditos);
        menuJuego.add(itemRanking);
        menuJuego.add(itemNuevoJuego);
        menuBar.add(menuJuego);

        JMenu menuOpciones = new JMenu("Opciones");
        JCheckBoxMenuItem itemSonido = new JCheckBoxMenuItem("Sonido", true);
        itemSonido.addActionListener(e -> toggleSonido(itemSonido.isSelected()));
        menuOpciones.add(itemSonido);
        menuBar.add(menuOpciones);

        JMenu menuSalir = new JMenu("Salir");
        menuBar.add(menuSalir);

        return menuBar;
    }

    private void mostrarMapa() {
        JFrame mapaFrame = new JFrame("Mapa de Uruguay");
        mapaFrame.setSize(800, 600);
        mapaFrame.setLocationRelativeTo(null);

        JPanel mapaPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon mapaImagen = new ImageIcon("imagenes/mapa.png");
                g.drawImage(mapaImagen.getImage(), 0, 0, getWidth(), getHeight(), null);
                // Dibujar línea de animación
                if (startPoint != null && endPoint != null && currentPosition < 1.0) {
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setColor(Color.RED);
                    g2d.setStroke(new BasicStroke(2));
                    int x1 = (int) (startPoint.x + (endPoint.x - startPoint.x) * currentPosition);
                    int y1 = (int) (startPoint.y + (endPoint.y - startPoint.y) * currentPosition);
                    g2d.drawLine(startPoint.x + 5, startPoint.y + 5, x1 + 5, y1 + 5);
                }
            }
        };
        mapaPanel.setLayout(null);

        CiudadDAO ciudadDAO = new CiudadDAO();
        List<Ciudad> ciudades = ciudadDAO.obtenerTodasLasCiudades();

        for (Ciudad ciudad : ciudades) {
            JButton botonCiudad = new JButton();
            botonCiudad.setBounds(ciudad.getX(), ciudad.getY(), 10, 10); // Tamaño reducido a la cuarta parte
            botonCiudad.setBackground(Color.BLUE);
            botonCiudad.setOpaque(true);
            botonCiudad.setBorderPainted(false);
            botonCiudad.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            botonCiudad.setPreferredSize(new Dimension(10, 10)); // Tamaño reducido a la cuarta parte
            botonCiudad.setContentAreaFilled(false);
            botonCiudad.setOpaque(true);
            botonCiudad.setFocusPainted(false);
            botonCiudad.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            botonCiudad.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
                @Override
                public void installUI(JComponent c) {
                    super.installUI(c);
                    c.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                }

                @Override
                public Dimension getPreferredSize(JComponent c) {
                    return new Dimension(10, 10);
                }

                @Override
                public void paint(Graphics g, JComponent c) {
                    super.paint(g, c);
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    int diameter = Math.min(c.getWidth(), c.getHeight());
                    int x = (c.getWidth() - diameter) / 2;
                    int y = (c.getHeight() - diameter) / 2;
                    g2.fillOval(x, y, diameter, diameter);
                    g2.dispose();
                }
            });

            botonCiudad.addActionListener(e -> {
                startPoint = botonCiudad.getLocation();
                mostrarCiudad(ciudad, mapaPanel);
            });
            mapaPanel.add(botonCiudad);
            botonesCiudades.add(botonCiudad);
        }

        mapaFrame.add(mapaPanel);
        mapaFrame.setVisible(true);
    }

    private void mostrarCiudad(Ciudad ciudad, JPanel mapaPanel) {
        labelNombreLugar.setText(ciudad.getNombre());
        labelFechaHora.setText("Fecha y Hora Actualizada");
        labelImagen.setIcon(new ImageIcon(ciudad.getRutaImagen()));
        areaTexto.setText(ciudad.getDescripcion());

        // Cambiar color del botón a rojo
        for (JButton boton : botonesCiudades) {
            if (boton.getLocation().equals(startPoint)) {
                boton.setBackground(Color.RED);
                botonesVisitados.add(boton);
            }
        }

        endPoint = new Point(ciudad.getX(), ciudad.getY());
        currentPosition = 0.0;
        if (animationTimer != null) {
            animationTimer.stop();
        }
        animationTimer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentPosition += 0.02;
                if (currentPosition >= 1.0) {
                    animationTimer.stop();
                }
                mapaPanel.repaint();
            }
        });
        animationTimer.start();

             // Simular el viaje
        avanzarTiempo(5);
    }

    private void avanzarTiempo(int horas) {
        // Implementar la lógica para avanzar el tiempo y actualizar el labelFechaHora
        // Esto podría incluir sumar horas a un objeto Date y formatearlo como cadena
    }

    private void playSound(String soundFilePath) {
        try {
            File soundFile = new File(soundFilePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    private void stopSound() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }

    private void toggleSonido(boolean activar) {
        if (activar) {
            clip.start();
        } else {
            stopSound();
        }
        sonidoActivo = activar;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Interfaz());
    }
}
