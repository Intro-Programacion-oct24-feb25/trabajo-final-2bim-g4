/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionnatacion;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class natacion {
    public static String registrarParticipanteNatacion(String reporte){
           Scanner entrada = new Scanner(System.in);
           String posicion = "";
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
           System.out.println("Ingrese estilo favorito");
           String equipo = entrada.nextLine();
           
           reporte=String.format("%s\n"+"Nombre del participante: %s\n"
                   + "Edad del participante: %d\n"
                   + "Nivel del participante: %s\n"
                   +"Ciudad del participante: %s\n"
           + "Estilo favorito: %s\n",reporte, nombre,edad,posicion,ciudad,equipo);
return reporte;
} 
    
}
