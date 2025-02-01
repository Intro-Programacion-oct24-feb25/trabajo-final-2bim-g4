/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionobtenerreporte;

import funcionatletismo.*;

/**
 *
 * @author carlo
 */
public class obtenereporte {
    public static String obtenerReporte(String[] nombres, int[] actividades) {
        String reporte2 = "";

        for (int i = 0; i < 6; i++) {
            reporte2 +=i+1+". "+"Número de participaciones de " + nombres[i] + ": " + 
                    actividades[i] + "\n";
        }

        reporte2 = "Las actividades ingresadas son:\n" + reporte2;

        return reporte2;
    }
}
