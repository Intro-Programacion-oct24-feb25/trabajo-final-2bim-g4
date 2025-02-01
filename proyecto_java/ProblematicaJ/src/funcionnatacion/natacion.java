/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionnatacion;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class natacion {

    public static String registrarParticipanteNatacion() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String estilo;
        String reporte = "";

        System.out.println("Ingrese nombre del participante");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nivel: (Principiante, Intermedio,"
                + "Avanzado)");
        nivel = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese estilo favorito");
        estilo = entrada.nextLine();

        reporte = String.format("%s\n" + "Nombre del participante: %s\n"
                + "Edad del participante: %d\n"
                + "Nivel del participante: %s\n"
                + "Ciudad del participante: %s\n"
                + "Estilo favorito: %s\n", reporte, nombre, edad, nivel, ciudad,
                estilo);
        return reporte;
    }

}
