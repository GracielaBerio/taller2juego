package presentacion;

import Controllers.CriminalController;
import DAO.CriminalDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuscarCriminalVista {
    private JFrame frame;
    private JTextField campoBusqueda;
    private JButton botonBuscar;
    private JTextArea areaResultado;

    public BuscarCriminalVista() {
        // Configuración de la ventana principal
        frame = new JFrame("Buscar Criminal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        // Campo de entrada para la búsqueda
        JLabel etiquetaBusqueda = new JLabel("Buscar por ID o Nombre:");
        etiquetaBusqueda.setBounds(10, 10, 150, 25);
        frame.add(etiquetaBusqueda);

        campoBusqueda = new JTextField();
        campoBusqueda.setBounds(170, 10, 200, 25);
        frame.add(campoBusqueda);

        // Botón para iniciar la búsqueda
        botonBuscar = new JButton("Buscar");
        botonBuscar.setBounds(120, 50, 150, 25);
        frame.add(botonBuscar);

        // Área de texto para mostrar los resultados
        areaResultado = new JTextArea();
        areaResultado.setBounds(10, 90, 360, 250);
        frame.add(areaResultado);

        // Acción del botón de búsqueda
        botonBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de ControladorCriminal
                CriminalController controller = new CriminalController();

                // Obtener el valor de búsqueda ingresado
                String valorBusqueda = campoBusqueda.getText();

                // Buscar el criminal por ID o Nombre
                String resultado = controller.buscarCriminal(valorBusqueda);

                // Mostrar el resultado en el área de texto
                areaResultado.setText(resultado);
            }
        });

        // Hacer visible la ventana
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Ejecutar la aplicación
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BuscarCriminalVista();
            }
        });
    }
}
