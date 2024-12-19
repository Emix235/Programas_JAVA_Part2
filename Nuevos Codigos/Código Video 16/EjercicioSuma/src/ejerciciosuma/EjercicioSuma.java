/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosuma;

import java.util.logging.Logger;

/**
 *
 * @author Global Tech
 * Enunciado: Escriba un programa que permita la suma de dos números enteros e 
 * imprima su resultado.
 * Fecha: 22-09-2017.
 */
public class EjercicioSuma {
    // Declaración global de Variables
    static int numero1, numero2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable miembro de la función
        int resultado;
        
        // Entrada 
        numero1 = 45;
        numero2 = 3;
        
        // Proceso
        resultado = numero1 * numero2;
        
        // Salida
        System.out.println("Primer Numero: "+numero1);
        System.out.println("Segundo Numero: "+numero2);
        System.out.println("----------------------------");
        System.out.println("Valor de la Multiplicación = "+resultado);
        
        //Tarea: Completar el ejercicio con todas las 
        // operaciones (+, -, *, /, %)
    }
    
}
