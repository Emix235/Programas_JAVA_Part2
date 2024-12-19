/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Global Tech
 */
public class ConexionBD {
    static Connection conexion;
    static Statement estatuto;
    static ResultSet resultados;
    
    //Variables de ConexiónBD
    String nombreBD;
    String usuarioBD;
    String claveBD;
    
    public ConexionBD(){
        nombreBD = "prueba";
        usuarioBD = "root";
        claveBD = "";
    }
    /**
    * Función Conectar
    * @author Global Tech
    */
    public void conectar(){
        try {
            //1. Cargar los Controladores
            Class.forName("com.mysql.jdbc.Driver");
            //2. Establecer la Conexion
            conexion = DriverManager.getConnection
                    ("jdbc:mysql://localhost/"+nombreBD,""+usuarioBD ,""+claveBD);
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
    
    public void conectar(String nombreBD){
        try {
            //1. Cargar los Controladores
            Class.forName("com.mysql.jdbc.Driver");
            //2. Establecer la Conexion
            conexion = DriverManager.getConnection
                        ("jdbc:mysql://localhost/"+nombreBD,"root" ,"");
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
    public void conectar(String nombreBD, String usuarioBD, String claveBD){
        try {
            //1. Cargar los Controladores
            Class.forName("com.mysql.jdbc.Driver");
            //2. Establecer la Conexion
            conexion = DriverManager.getConnection
                    ("jdbc:mysql://localhost/"+nombreBD,""+usuarioBD ,""+claveBD);
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
    
    //Funcion Insertar **********************************************************************
    
    public void insertar
        (String nombreTabla, String values){
        try {
        estatuto = conexion.createStatement();
        String sql = "INSERT INTO "+nombreTabla+" VALUES ("+values+")";
        System.out.println(sql);
        estatuto.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Registro Completo");
        estatuto.close();
        }catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "ERROR DE ESTATUTO\n"+ex,
                    "MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Funcion Consultar **********************************************************************
    
    public void Consultar(){
        try {
            estatuto = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            resultados = estatuto.executeQuery("SELECT * FROM producto WHERE codigo = '1'");
            
            boolean existe = resultados.last();
            if(existe){
                int codigo = resultados.getInt("codigo");
                String nombre = resultados.getString("nombre");
                String descripcion = resultados.getString("descripcion");
                int cantidad = resultados.getInt("cantidad");
                String estado = resultados.getString("estado");
                
                System.out.println("\n*********Datos de la Consulta**********\n"
                        + "Codigo: "+codigo+"\n"
                        + " Nombre: "+nombre+ "\n"
                        + " Descripcion: "+descripcion+ "\n"
                        + " Cantidad: "+cantidad+"\n"
                        + " Estado: "+estado);
            }else{
                System.out.println("Registro no Existe");
            }
            estatuto.close();
            resultados.close();
        }catch(SQLException e){ System.err.println(e);}
        catch(Exception e){ System.err.println(e.getMessage());}
    } 
}  
