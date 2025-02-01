/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionfutbol;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class futbol {
    public static String registrarParticipanteFutbol(String reporte){
           Scanner entrada = new Scanner(System.in);
           System.out.println("Ingrese nombre del participante");
           String nombre = entrada.nextLine();
           System.out.println("Ingrese la edad del participante");
           int edad = entrada.nextInt();
           entrada.nextLine();
           System.out.println("Ingrese la posicion preferida del participante");
           String posicion = entrada.nextLine();
           System.out.println("Ingrese la ciudad del participante");
           String ciudad = entrada.nextLine();
           System.out.println("Ingrese nombre del equipo favorito del "
                   + "participante");
           String equipo = entrada.nextLine();
           
           reporte=String.format("%s\n"+"Nombre del participante: %s\n"
                   + "Edad del participante: %d\n"
                   + "Posición preferida del participante: %s\n"
                   +"Ciudad del participante: %s\n"
           + "Equipo favorito: %s\n",reporte, nombre,edad,posicion,ciudad,equipo);
           return reporte;

} 
    
}
