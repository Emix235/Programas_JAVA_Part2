/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultarbd;

import Clases.ConexionBD;

/**
 *
 * @author Global Tech
 */
public class ConsultarBD {
    static ConexionBD c;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        c = new ConexionBD();
        c.conectar("Prueba");
        
        c.Consultar();
        
    }
    
}
