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
    public static String registrarParticipanteBasquetball(String reporte){
           Scanner entrada = new Scanner(System.in);
           System.out.println("Ingrese nombre del participante");
           String nombre = entrada.nextLine();
           System.out.println("Ingrese la edad del participante");
           int edad = entrada.nextInt();
           entrada.nextLine();
           System.out.println("Ingrese la posicion prefrerida del participante");
           String posicion = entrada.nextLine();
           System.out.println("Ingrese la estatura del"
                   + "participante");
           double equipo = entrada.nextDouble();
           entrada.nextLine();
           System.out.println("Ingrese la ciudad del participante");
           String ciudad = entrada.nextLine();
           
        reporte=String.format("%s\n"+"Nombre del participante: %s\n"
                   + "Edad del participante: %d\n"
                   + "Posición preferida del participante: %s\n"
                   +"Estatura del participante: %.2f\n"
           + "Ciudad: %s\n",reporte, nombre,edad,posicion,equipo,ciudad);
         return reporte;
}
}
