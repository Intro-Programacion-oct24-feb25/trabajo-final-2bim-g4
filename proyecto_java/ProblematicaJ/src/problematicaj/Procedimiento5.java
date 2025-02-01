/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problematicaj;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Procedimiento5 {
    public static void registrarParticipanteCiclismo(){
           Scanner entrada = new Scanner(System.in);
           String posicion ="";
           System.out.println("Ingrese nombre del participante");
           String nombre = entrada.nextLine();
           System.out.println("Ingrese la edad del participante");
           int edad = entrada.nextInt();
           entrada.nextLine();
           System.out.println("Ingrese el tipo de ciclismo: Montaña (1), "
                   + "Ruta (2),"
                   + "Urbano (3)");
           int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    posicion = "montaña";
                    break;
                case 2:
                    posicion = "ruta";
                    break;
                    case 3:
                    posicion = "urbano";
                    break;
                    default:
                        System.out.println("Número fuera de rango");
                    }
            entrada.nextLine();
           System.out.println("Ingrese la ciudad del participante");
           String ciudad = entrada.nextLine();
           System.out.println("Ingrese marca de bicicleta preferida");
           String equipo = entrada.nextLine();
           
           System.out.printf("Nombre del participante: %s\n"
                   + "Edad del participante: %d\n"
                   + "Tipo de ciclismo: %s\n"
                   +"Ciudad del participante: %s\n"
           + "marca de bicicleta favorita: %s\n", nombre,edad,posicion,ciudad,
           equipo);

} 
    
}
