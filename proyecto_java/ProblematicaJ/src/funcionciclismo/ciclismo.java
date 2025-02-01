/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionciclismo;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class ciclismo {

    public static String registrarParticipanteCiclismo() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String ciclismo;
        String ciudad;
        String marca;
        String reporte = "";
        System.out.println("Ingrese nombre del participante");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el tipo de ciclismo:(Montaña, Ruta, "
                + "Urbano)");
        ciclismo = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese marca de bicicleta preferida");
        marca = entrada.nextLine();

        reporte = String.format("%s\n" + "Nombre del participante: %s\n"
                + "Edad del participante: %d\n"
                + "Tipo de ciclismo: %s\n"
                + "Ciudad del participante: %s\n"
                + "marca de bicicleta favorita: %s\n", reporte, nombre, edad, 
                                                      ciclismo, ciudad,marca);
        return reporte;
    }
}
