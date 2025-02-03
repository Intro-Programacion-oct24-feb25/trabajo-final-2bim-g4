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

        for (int i = 0; i < actividades.length; i++) {
            reporte = String.format("%s%d.Numero de participantes de %s: %d\n",
                    reporte, (i + 1), nombres[i], actividades[i]);
        }
        return reporte;
    }
}
