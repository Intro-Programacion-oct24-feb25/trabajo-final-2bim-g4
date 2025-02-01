/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionbasquetbol;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class basquetbol {

    public static String registrarParticipanteBasquetball() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String posicion;
        int estatura;
        String ciudad;
        String reporte = "";
        System.out.println("Ingrese nombre del participante");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la posicion prefrerida del participante");
        posicion = entrada.nextLine();
        System.out.println("Ingrese la estatura del"
                + "participante en cm");
        estatura = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante");
        ciudad = entrada.nextLine();

        reporte = String.format("%s\n" + "Participante: %s\n"
                + "Edad: %d\n"
                + "Posición preferida: %s\n"
                + "Estatura del participante en cm: %d\n"
                + "Ciudad: %s\n", reporte, nombre, edad, posicion, estatura, 
                                   ciudad);
        return reporte;
    }
}
