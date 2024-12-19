/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Global Tech
 */
public class ConexionBD {
    static Connection conexion;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //1. Cargar los Controladores
            Class.forName("com.mysql.jdbc.Driver");
            //2. Establecer la Conexion
            conexion = DriverManager.getConnection
                        ("jdbc:mysql://localhost/prueba","root" ,"");
            //3 Notificar la conexión
            System.out.println("Conexion Exitosa");
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "CONTROLADORES NO CARGADOS",
                    "MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "ERROR DEL SERVIDOR\n"+ex,
                    "MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
