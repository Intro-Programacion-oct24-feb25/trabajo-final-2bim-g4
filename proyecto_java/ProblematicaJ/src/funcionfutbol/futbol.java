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
    public static String registrarParticipanteFutbol(){
           Scanner entrada = new Scanner(System.in);
           String nombre;
           int edad;
           String posicion;
           String ciudad;
           String equipo;
           String reporte = "";
           System.out.println("Ingrese nombre del participante");
           nombre = entrada.nextLine();
           System.out.println("Ingrese la edad del participante");
           edad = entrada.nextInt();
           entrada.nextLine();
           System.out.println("Ingrese la posicion preferida del participante");
           posicion = entrada.nextLine();
           System.out.println("Ingrese la ciudad del participante");
           ciudad = entrada.nextLine();
           System.out.println("Ingrese nombre del equipo favorito del "
                   + "participante");
           equipo = entrada.nextLine();
           
           reporte=String.format("%s\n"+"Participante: %s\n"
                   + "Edad: %d\n"
                   + "Posición preferida: %s\n"
                   +"Ciudad: %s\n"
           + "Equipo favorito: %s\n",reporte, nombre,edad,posicion,ciudad,equipo);
           return reporte;

} 
    
}
