package com.mycompany.taller2juego;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Font;
import java.awt.BorderLayout;

public class MainWindow extends JFrame {

    public MainWindow() {
        // Configurar la ventana
        setTitle("Carmen Sandiego: Aventura en Uruguay");
        setSize(800, 600); // Ancho x Alto
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Crear un JLabel para el título
        JLabel titleLabel = new JLabel("Carmen Sandiego: Aventura en Uruguay", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 32)); // Cambiar tamaño y estilo de fuente

        // Crear un panel para el título
        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Añadir márgenes
        titlePanel.add(titleLabel, BorderLayout.NORTH);

        // Agregar el panel a la ventana
        add(titlePanel, BorderLayout.NORTH);

        // Hacer visible la ventana
        setVisible(true);
    }
}
