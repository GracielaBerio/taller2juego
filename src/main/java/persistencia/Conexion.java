/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import biblioteca.*;
import javax.swing.ImageIcon;

/**
 *
 * @author grabe
 */
public class Conexion {

    public Conexion() {
    }

    public Ciudad obtenerCiudad(int idCiudad) {
        Ciudad c = new Ciudad();
        c.setIdCiudad(idCiudad);
        c.setImagen("Cv_Montevideo.jpg");
        c.setDescripcion("Montevideo, descripción de la ciudad...");
        c.setNombre(" Montevideo");

        return c;
    }

}
