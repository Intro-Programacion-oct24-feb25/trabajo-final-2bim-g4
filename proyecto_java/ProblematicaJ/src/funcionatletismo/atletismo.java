/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionatletismo;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class atletismo {

    public static String registrarParticipanteAtletismo() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String especialidad;
        String ciudad;
        String record;
        String reporte = "";

        System.out.println("Ingrese nombre del participante");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la especialidad: (Carreras, Salto,"
                + "Lanzamiento)");
        especialidad = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese récord personal");
        record = entrada.nextLine();

        reporte = String.format("%s\n" + "Nombre del participante: %s\n"
                + "Edad del participante: %d\n"
                + "Especialidad del participante: %s\n"
                + "Ciudad del participante: %s\n"
                + "Récord personal: %s\n", reporte, nombre, edad, especialidad, 
                                           ciudad,record);
        return reporte;

    }
}
