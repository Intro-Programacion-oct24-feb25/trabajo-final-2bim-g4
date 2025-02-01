/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematicaj;

import java.util.Scanner;
import funcionatletismo.atletismo;
import funcionbasquetbol.basquetbol;
import funcionciclismo.ciclismo;
import funcionfutbol.futbol;
import funcionnatacion.natacion;
import funciontenis.funciontenis;
import funcionyoga.funcionyoga;
import funcionobtenerinformacion.obtenerinformacion;
import funcionobtenerreporte.obtenereporte;
import funcionobtenersuma.obtenersuma;

/**
 *
 * @author utpl
 */
public class ProblematicaJ {
public static String reporte="Reporte:\n";
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
               reporte = reporte + futbol.registrarParticipanteFutbol();
                arreglo[0] = arreglo[0] + 1;

            } else {
                if (indice == 2) {
                  reporte = reporte + natacion.registrarParticipanteNatacion();
                    arreglo[1] = arreglo[1] + 1;

                } else {
                    if (indice == 3) {
                       reporte = reporte + atletismo.registrarParticipanteAtletismo();
                        arreglo[2] = arreglo[2] + 1;

                    } else {
                        if (indice == 4) {
                            reporte =  reporte + basquetbol.registrarParticipanteBasquetball();
                            arreglo[3] = arreglo[3] + 1;
                        } else {
                            if (indice == 5) {
                                reporte =  reporte + ciclismo.registrarParticipanteCiclismo();
                                arreglo[4] = arreglo[4] + 1;

                            } else {
                                if (indice == 6) {
                                   reporte = reporte + funciontenis.registrarParticipanteTenis();
                                    arreglo[5] = arreglo[5] + 1;

                                } else {
                                    if (indice == 7) {
                                      reporte = reporte + funcionyoga.registrarParticipanteYoga();
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
        sumatotal= obtenersuma.obtenerSuma(arreglo);
        mensajeActividades = obtenerinformacion.obtenerInformacion(sumatotal);
        String[] nombres = {"Futbol", "Natacion", "Atletismo", "Basquetball",
            "Ciclismo", "Tenis", "Yoga"};
        cadenaReporte = obtenereporte.obtenerReporte(nombres, arreglo);
        System.out.printf("%s\n", reporte);
        System.out.printf("%s\n", mensajeActividades);
        System.out.printf("%s\n", cadenaReporte);

    }
     

}


