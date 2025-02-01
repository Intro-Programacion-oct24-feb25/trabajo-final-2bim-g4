/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionobtenersuma;


/**
 *
 * @author carlo
 */
public class obtenersuma {
    public static int obtenerSuma(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < 6; i++) {
            suma += arreglo[i];
        }
        return suma;
    }
}
