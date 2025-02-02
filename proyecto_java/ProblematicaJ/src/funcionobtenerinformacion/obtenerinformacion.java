/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionobtenerinformacion;

/**
 *
 * @author carlo
 */
public class obtenerinformacion {

    public static String obtenerInformacion(int suma) {
        String mensaje = "";

        if (suma == 0) {
            mensaje = "¡Mala campaña, debes mejorar!\n";
        } else {
            if (suma >= 1 && suma <= 5) {
                mensaje = "Poca participación en el club, hay que mejorar.\n";
            } else {
                if (suma >= 6 && suma <= 15) {
                    mensaje = "Buena participación, sigue así!\n";
                } else {
                    mensaje = "¡Excelente campaña del club!\n";
                }
            }
        }

        return mensaje;
    }
}
