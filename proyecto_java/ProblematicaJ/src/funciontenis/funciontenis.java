/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciontenis;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class funciontenis {

    public static String registrarParticipanteTenis() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String mano;
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
        System.out.println("Ingrese la mano hábil: (Derecha, Izquierda)");
        mano = entrada.nextLine();
        reporte = String.format("%s\n" + "Participante: %s\n"
                + "Edad: %d\n"
                + "Nivel: %s\n"
                + "Ciudad: %s\n"
                + "Mano hábil: %s\n", reporte, nombre, edad, nivel, ciudad, mano);
        return reporte;
    }
}
