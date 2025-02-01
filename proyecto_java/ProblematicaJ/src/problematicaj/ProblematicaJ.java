/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematicaj;

import java.util.Scanner;
import static problematicaj.Procedimiento1.registrarParticipanteFutbol;
import static problematicaj.Procedimiento2.registrarParticipanteNatacion;
import static problematicaj.Procedimiento3.registrarParticipanteAtletismo;
import static problematicaj.Procedimiento4.registrarParticipanteBasquetball;
import static problematicaj.Procedimiento5.registrarParticipanteCiclismo;
import static problematicaj.Procedimiento6.registrarParticipanteTenis;
import static problematicaj.Procedimiento7.registrarParticipanteYoga;

/**
 *
 * @author utpl
 */
public class ProblematicaJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        int indice;
        int sumatotal;
        String letra;
        int[] arreglo = new int[7];
        String mensajeActividades;
        String cadenaReporte;
        while (bandera) {
            System.out.printf("Ingrese segun desee:\nFutbol(1)\nNatacion"
                    + "(2)\nAtletismo(3)\nBasquetball(4)\nCiclismo(5)\n"
                    + "Tenis(6)\nYoga(7)\n");
            indice = entrada.nextInt();
            if (indice == 1) {
                registrarParticipanteFutbol();
                arreglo[0] = arreglo[0] + 1;

            } else {
                if (indice == 2) {
                    registrarParticipanteNatacion();
                    arreglo[1] = arreglo[1] + 1;

                } else {
                    if (indice == 3) {
                        registrarParticipanteAtletismo();
                        arreglo[2] = arreglo[2] + 1;

                    } else {
                        if (indice == 4) {
                            registrarParticipanteBasquetball();
                            arreglo[3] = arreglo[3] + 1;
                        } else {
                            if (indice == 5) {
                                registrarParticipanteCiclismo();
                                arreglo[4] = arreglo[4] + 1;

                            } else {
                                if (indice == 6) {
                                    registrarParticipanteTenis();
                                    arreglo[5] = arreglo[5] + 1;

                                } else {
                                    if (indice == 7) {
                                        registrarParticipanteYoga();
                                        arreglo[6] = arreglo[6] + 1;

                                    } else {
                                        System.out.println("Lo sentimos, el"
                                                + "club no tiene esa opcion"
                                                + "\n");
                                    }

                                }
                            }

                        }

                    }
                }
            }
            System.out.println("Desea salir? (si)");
            entrada.nextLine();
            letra = entrada.nextLine();
            if (letra.equals("si")) {
                bandera = false;
            }

        }
        sumatotal= obtenerSuma(arreglo);
        mensajeActividades = obtenerInformacion(sumatotal);
        String[] nombres = {"Futbol", "Natacion", "Atletismo", "Basquetball",
            "Ciclismo", "Tenis", "Yoga"};
        cadenaReporte = obtenerReporte(nombres, arreglo);
        System.out.printf("%s\n", mensajeActividades);
        System.out.printf("%s\n", cadenaReporte);

    }
    public static int obtenerSuma(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < 6; i++) {
            suma += arreglo[i];
        }
        return suma;
    }
    public static String obtenerInformacion(int suma) {
        String mensaje = "";

        if (suma == 0) {
            mensaje = "¡Mal compañero, debes mejorar!";
        } else if (suma >= 1 && suma <= 5) {
            mensaje = "Poca participación en el club, hay que mejorar.";
        } else if (suma >= 6 && suma <= 15) {
            mensaje = "Buena participación, ¡sigue así!";
        } else {
            mensaje = "¡Excelente compañero del club!";
        }

        return mensaje;
    }
    public static String obtenerReporte(String[] nombres, int[] actividades) {
        String reporte = "";

        for (int i = 0; i < 6; i++) {
            reporte +=i+1+". "+"Número de participaciones de " + nombres[i] + ": " + 
                    actividades[i] + "\n";
        }

        reporte = "Las actividades ingresadas son:\n" + reporte;

        return reporte;
    }

}


