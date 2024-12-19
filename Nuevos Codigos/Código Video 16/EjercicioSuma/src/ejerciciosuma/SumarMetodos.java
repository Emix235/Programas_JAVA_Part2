/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosuma;

/**
 *
 * @author Global Tech
 * Enunciado: Escriba un programa que permita la suma de dos números enteros e 
 * imprima su resultado. Bajo implementación de metodos y mensajes.
 * Fecha:03-10-2017.
 */
public class SumarMetodos {
// Declaración de Variables
    /** Documentación de las variables
    * Descripción: Variables numericas para calcular
    */
    int n1, n2;
    
    /**Documentación de las variables
    * Descripción: Variable numerica para almacenar el resultado de la operación
    */
    int resultado;

// Declaraciones de Metodos
    /** Documentación de las funciones
    * Metodo Constructor por defecto sin parametros
    * Inicializa las variables en cero.
    */
    public SumarMetodos() {
        // Inicializar las Variables
        n1=0;
        n2=0;
        resultado=0;
        
        System.out.println("1"); //Utilizado para verificar el llamado al metodo.
     }
    
    /** Documentación de las funciones
    * Metodo Constructor de la clase con parametros
    * @param n1 variable
    * @param n2 variable
    * @param resultado variable
    */
    public SumarMetodos(int n1, int n2, int resultado) {
        this.n1 = n1;
        this.n2 = n2;
        this.resultado = resultado;
        System.out.println("2"); //Utilizado para verificar el llamado al metodo.
    }

    /* Tipos de Métodos básicos de Java
    get : Obtener un dato. Función de Retorno.
    set : Modificar un dato. No es Función de Retorno.
     */
    
    /**
    * Metodo entero (int) obtener (get) valor de N1, sin parametros
    * @return n1
    */
    public int getN1() {
        return n1;
    }
    /**
    * Metodo entero (int) obtener (get) valor de N2, sin parametros
    * @return n2
    */
    public int getN2() {
        return n2;
    }
    
    /**
    * Metodo entero (int) obtener (get) valor de Resultado, sin parametros
    * @return resultado
    */
    public int getResultado() {
        return resultado;
    }
    
    /**
    * Metodo vacio (void) modificar (set) valor de N1, con parametros
    * @param n1
    */
    public void setN1(int n1) {
        this.n1 = n1;
    }

    /**
    * Metodo vacio (void) modificar (set) valor de N2, con parametros
    * @param n2 como parametro de entrada
    */
    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    /**
    * Metodo entero (int) obtener (get) calculo de la suma, sin parametros
    * @return resultado
    */
    public int calcularSuma(){
        resultado = n1+n2;
        return resultado;
    }
    
    /**
    * Metodo vacio (void) mostrar resultado de la Suma, sin parametros
    */
    public void mostrarResultado(){
        System.out.println("La Suma es= "+resultado);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Construir el Objeto
        SumarMetodos prueba1 = new SumarMetodos(1,1,0);
        
        System.out.println("Valor de n1 = "+prueba1.getN1());
        System.out.println("Valor de n2 = "+prueba1.getN2());
        System.out.println("Valor de Resultado = "+prueba1.getResultado());
        
        prueba1.setN1(10);
        prueba1.setN2(45);
        prueba1.calcularSuma();
        prueba1.mostrarResultado();
    }
    
}
