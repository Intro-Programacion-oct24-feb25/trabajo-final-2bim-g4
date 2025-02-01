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
public class Procedimiento6 {
    public static void registrarParticipanteTenis(){
           Scanner entrada = new Scanner(System.in);
           String posicion= "";
           String posicion2= "";
           System.out.println("Ingrese nombre del participante");
           String nombre = entrada.nextLine();
           System.out.println("Ingrese la edad del participante");
           int edad = entrada.nextInt();
           entrada.nextLine();
           System.out.println("Ingrese el nivel: Principiante (1), Intermedio (2),"
                   + "Avanzado (3)");
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
           System.out.println("Ingrese la mano hábil: Derecha (1), Izquierda (2)");
           int equipo = entrada.nextInt();
           switch (equipo) {
                case 1:
                    posicion2 = "derecha";
                    break;
                case 2:
                    posicion2 = "izquierda";
                    break;
                    default:
                        System.out.println("Número fuera de rango");
                        }
           
           System.out.printf("Nombre del participante: %s\n"
                   + "Edad del participante: %d\n"
                   + "Nivel del participante: %s\n"
                   +"Ciudad del participante: %s\n"
           + "Mano hábil %s\n", nombre,edad,posicion,ciudad,posicion2);

} 
    
}
