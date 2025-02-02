/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionobtenerreporte;

/**
 *
 * @author carlo
 */
public class obtenereporte {

    public static String obtenerReporte(String[] nombres, int[] actividades) {
        String reporte = "Las actividades ingresadas son: \n";

        for (int i = 0; i < 6; i++) {
            reporte = reporte + i + 1 + ". " + "Número de participantes de " + nombres[i] + ": "
                    + actividades[i] + "\n";
        }
        return reporte;
    }
}
