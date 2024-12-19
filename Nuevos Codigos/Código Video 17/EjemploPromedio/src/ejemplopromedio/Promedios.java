/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopromedio;

/**
 * Enunciado: Clase Objeto que permita el calculo de promedios
 * @author Global Tech
 * Fecha: 03-10-2017
 */
public class Promedios {
    //Declaración de Variables
    double numero1, numero2, numero3, numero4;
    
    //Declaración del Metodo Constructor
    public Promedios() {
        // Inicializar variables
    }
    
    //Calcular el Promedio
    public double promedio(double numero1, double numero2, double numero3, double numero4){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
        this.numero4 = numero4;
        return (numero1+numero2+numero3+numero4)/4;
    }
    
}
