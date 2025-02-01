/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionyoga;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class funcionyoga {

    public static String registrarParticipanteYoga() {
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
        System.out.println("Ingrese el nivel: (Principiante, Intermedio, "
                + "Avanzado)");
        nivel = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el estilo de yoga favorito");
        estilo = entrada.nextLine();

        reporte = String.format("%s\n" + "Participante: %s\n"
                + "Edad: %d\n"
                + "Nivel: %s\n"
                + "Ciudad: %s\n"
                + "Estilo favorito: %s\n", reporte, nombre, edad, nivel, ciudad,
                                            estilo);
        return reporte;
    }
}
