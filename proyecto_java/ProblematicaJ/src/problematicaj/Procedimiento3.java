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
public class Procedimiento3 {
    public static void registrarParticipanteAtletismo(){
           Scanner entrada = new Scanner(System.in);
           String posicion = "";
           System.out.println("Ingrese nombre del participante");
           String nombre = entrada.nextLine();
           System.out.println("Ingrese la edad del participante");
           int edad = entrada.nextInt();
           System.out.println("Ingrese la especialidad: Carreras (1), Salto (2),"
                   + "Lanzamiento (3)");
           int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    posicion = "principiante";
                    break;
                case 2:
                    posicion = "intermedio";
                    break;
                    case 3:
                    posicion = "avanzado";
                    break;
                    default:
                        System.out.println("Número fuera de rango");
                    }
            entrada.nextLine();
           System.out.println("Ingrese la ciudad del participante");
           String ciudad = entrada.nextLine();
           System.out.println("Ingrese récord personal");
           double equipo = entrada.nextDouble();
           
           System.out.printf("Nombre del participante: %s\n"
                   + "Edad del participante: %d\n"
                   + "Especialidad del participante: %s\n"
                   +"Ciudad del participante: %s\n"
           + "Récord personal: %s\n", nombre,edad,posicion,ciudad,equipo);

} 
    
}
