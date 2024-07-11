/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import biblioteca.Ciudad;
import javax.swing.ImageIcon;
import logica.Controlador;

/**
 *
 * @author grabe
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelCiudad = new javax.swing.JPanel();
        ciudadActual = new javax.swing.JLabel();
        imagenCiudad = new javax.swing.JLabel();
        panelAcciones = new javax.swing.JPanel();
        pistaLugar = new javax.swing.JLabel();
        viajarCiudades = new javax.swing.JButton();
        listaCiudadesProx = new javax.swing.JButton();
        buscarLugar = new javax.swing.JButton();
        acusarCriminal = new javax.swing.JButton();
        barraNavegacion = new javax.swing.JMenuBar();
        barraJuego = new javax.swing.JMenu();
        creditosJuego = new javax.swing.JMenuItem();
        juegoNuevo = new javax.swing.JMenuItem();
        salirJuego = new javax.swing.JMenuItem();
        barraOpciones = new javax.swing.JMenu();
        sonidoActivacion = new javax.swing.JCheckBoxMenuItem();
        barraCriminales = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout panelCiudadLayout = new javax.swing.GroupLayout(panelCiudad);
        panelCiudad.setLayout(panelCiudadLayout);
        panelCiudadLayout.setHorizontalGroup(
            panelCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCiudadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ciudadActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagenCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
        );
        panelCiudadLayout.setVerticalGroup(
            panelCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCiudadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ciudadActual, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagenCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viajarCiudades.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        viajarCiudades.setIcon(new javax.swing.ImageIcon("C:\\Users\\grabe\\OneDrive\\Documentos\\GitHub\\taller2juego\\imagenes\\Botones\\Avion.png")); // NOI18N
        viajarCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viajarCiudadesActionPerformed(evt);
            }
        });

        listaCiudadesProx.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        listaCiudadesProx.setIcon(new javax.swing.ImageIcon("C:\\Users\\grabe\\OneDrive\\Documentos\\GitHub\\taller2juego\\imagenes\\Botones\\Ciudades.jpg")); // NOI18N
        listaCiudadesProx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaCiudadesProxActionPerformed(evt);
            }
        });

        buscarLugar.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        buscarLugar.setIcon(new javax.swing.ImageIcon("C:\\Users\\grabe\\OneDrive\\Documentos\\GitHub\\taller2juego\\imagenes\\Botones\\BuscarCiudades.jpg")); // NOI18N

        acusarCriminal.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        acusarCriminal.setIcon(new javax.swing.ImageIcon("C:\\Users\\grabe\\OneDrive\\Documentos\\GitHub\\taller2juego\\imagenes\\Botones\\Criminal.jpg")); // NOI18N

        javax.swing.GroupLayout panelAccionesLayout = new javax.swing.GroupLayout(panelAcciones);
        panelAcciones.setLayout(panelAccionesLayout);
        panelAccionesLayout.setHorizontalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(listaCiudadesProx, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viajarCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acusarCriminal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pistaLugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAccionesLayout.setVerticalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addComponent(pistaLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(listaCiudadesProx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viajarCiudades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarLugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acusarCriminal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        barraJuego.setText("Juego");

        creditosJuego.setText("Creditos");
        barraJuego.add(creditosJuego);

        juegoNuevo.setText("Nuevo Juego");
        juegoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juegoNuevoActionPerformed(evt);
            }
        });
        barraJuego.add(juegoNuevo);

        salirJuego.setText("Salir");
        barraJuego.add(salirJuego);

        barraNavegacion.add(barraJuego);

        barraOpciones.setText("Opciones");

        sonidoActivacion.setSelected(true);
        sonidoActivacion.setText("Sonido");
        barraOpciones.add(sonidoActivacion);

        barraNavegacion.add(barraOpciones);

        barraCriminales.setText("Criminales");
        barraCriminales.setEnabled(false);
        barraNavegacion.add(barraCriminales);

        setJMenuBar(barraNavegacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viajarCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viajarCiudadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viajarCiudadesActionPerformed

    private void listaCiudadesProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCiudadesProxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaCiudadesProxActionPerformed

    private void juegoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juegoNuevoActionPerformed
        Ciudad c = new Ciudad();
        c = new Controlador().seleccionarCiudad(1);
        ciudadActual.setText(c.getNombre());
        pistaLugar.setText(c.getDescripcion());
        ImageIcon icon = new ImageIcon("imagenes/" + c.getImagen());
        imagenCiudad.setIcon(icon);
        // TODO add your handling code here:
    }//GEN-LAST:event_juegoNuevoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acusarCriminal;
    private javax.swing.JMenu barraCriminales;
    private javax.swing.JMenu barraJuego;
    private javax.swing.JMenuBar barraNavegacion;
    private javax.swing.JMenu barraOpciones;
    private javax.swing.JButton buscarLugar;
    private javax.swing.JLabel ciudadActual;
    private javax.swing.JMenuItem creditosJuego;
    private javax.swing.JLabel imagenCiudad;
    private javax.swing.JMenuItem juegoNuevo;
    private javax.swing.JButton listaCiudadesProx;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JPanel panelCiudad;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel pistaLugar;
    private javax.swing.JMenuItem salirJuego;
    private javax.swing.JCheckBoxMenuItem sonidoActivacion;
    private javax.swing.JButton viajarCiudades;
    // End of variables declaration//GEN-END:variables
}
