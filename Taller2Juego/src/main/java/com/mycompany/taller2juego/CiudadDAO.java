package com.mycompany.taller2juego;

import java.util.ArrayList;
import java.util.List;

public class CiudadDAO {
    public List<Ciudad> obtenerTodasLasCiudades() {
        List<Ciudad> ciudades = new ArrayList<>();
        // Añadir las 32 ciudades con coordenadas de ejemplo
        ciudades.add(new Ciudad(1, "Colonia del Sacramento", null, "Descripción de Colonia", "imagenes/Colsacra.png", null, 50, 500));
        ciudades.add(new Ciudad(2, "Montevideo", null, "Descripción de Montevideo", "imagenes/Montevideo.png", null, 200, 550));
        ciudades.add(new Ciudad(3, "Canelones", null, "Descripción de Canelones", "imagenes/Canelones.png", null, 150, 400));
        ciudades.add(new Ciudad(4, "Maldonado", null, "Descripción de Maldonado", "imagenes/Maldonado.png", null, 300, 450));
        ciudades.add(new Ciudad(5, "Rivera", null, "Descripción de Rivera", "imagenes/Rivera.png", null, 400, 100));
        ciudades.add(new Ciudad(6, "Salto", null, "Descripción de Salto", "imagenes/Salto.png", null, 350, 50));
        ciudades.add(new Ciudad(7, "Paysandú", null, "Descripción de Paysandú", "imagenes/Paysandu.png", null, 300, 100));
        ciudades.add(new Ciudad(8, "Artigas", null, "Descripción de Artigas", "imagenes/Artigas.png", null, 450, 50));
        ciudades.add(new Ciudad(9, "San José", null, "Descripción de San José", "imagenes/SanJose.png", null, 250, 500));
        ciudades.add(new Ciudad(10, "Tacuarembó", null, "Descripción de Tacuarembó", "imagenes/Tacuarembo.png", null, 400, 300));
        ciudades.add(new Ciudad(11, "Florida", null, "Descripción de Florida", "imagenes/Florida.png", null, 300, 350));
        ciudades.add(new Ciudad(12, "Durazno", null, "Descripción de Durazno", "imagenes/Durazno.png", null, 350, 400));
        ciudades.add(new Ciudad(13, "Cerro Largo", null, "Descripción de Cerro Largo", "imagenes/CerroLargo.png", null, 500, 450));
        ciudades.add(new Ciudad(14, "Rocha", null, "Descripción de Rocha", "imagenes/Rocha.png", null, 550, 500));
        ciudades.add(new Ciudad(15, "Treinta y Tres", null, "Descripción de Treinta y Tres", "imagenes/TreintayTres.png", null, 600, 450));
        ciudades.add(new Ciudad(16, "Lavalleja", null, "Descripción de Lavalleja", "imagenes/Lavalleja.png", null, 650, 400));
        ciudades.add(new Ciudad(17, "Flores", null, "Descripción de Flores", "imagenes/Flores.png", null, 250, 550));
        ciudades.add(new Ciudad(18, "Río Negro", null, "Descripción de Río Negro", "imagenes/RioNegro.png", null, 200, 100));
        ciudades.add(new Ciudad(19, "Soriano", null, "Descripción de Soriano", "imagenes/Soriano.png", null, 150, 150));
        ciudades.add(new Ciudad(20, "Fray Bentos", null, "Descripción de Fray Bentos", "imagenes/FrayBentos.png", null, 100, 100));
        ciudades.add(new Ciudad(21, "Melo", null, "Descripción de Melo", "imagenes/Melo.png", null, 600, 200));
        ciudades.add(new Ciudad(22, "Mercedes", null, "Descripción de Mercedes", "imagenes/Mercedes.png", null, 50, 150));
        ciudades.add(new Ciudad(23, "San Carlos", null, "Descripción de San Carlos", "imagenes/SanCarlos.png", null, 500, 350));
        ciudades.add(new Ciudad(24, "Trinidad", null, "Descripción de Trinidad", "imagenes/Trinidad.png", null, 300, 250));
        ciudades.add(new Ciudad(25, "Santa Lucía", null, "Descripción de Santa Lucía", "imagenes/SantaLucia.png", null, 200, 300));
        ciudades.add(new Ciudad(26, "Nueva Palmira", null, "Descripción de Nueva Palmira", "imagenes/NuevaPalmira.png", null, 100, 200));
        ciudades.add(new Ciudad(27, "Pando", null, "Descripción de Pando", "imagenes/Pando.png", null, 400, 500));
        ciudades.add(new Ciudad(28, "Las Piedras", null, "Descripción de Las Piedras", "imagenes/LasPiedras.png", null, 350, 550));
        ciudades.add(new Ciudad(29, "San Carlos", null, "Descripción de San Carlos", "imagenes/SanCarlos.png", null, 550, 550));
        ciudades.add(new Ciudad(30, "Artigas", null, "Descripción de Artigas", "imagenes/Artigas.png", null, 650, 100));
        ciudades.add(new Ciudad(31, "Rivera", null, "Descripción de Rivera", "imagenes/Rivera.png", null, 600, 150));
        ciudades.add(new Ciudad(32, "Maldonado", null, "Descripción de Maldonado", "imagenes/Maldonado.png", null, 500, 600));
        return ciudades;
    }
}
