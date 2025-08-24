/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author braya
 */
public class Conexion {
    public Connection conexionBD;
    public final String db = "db_empresa";
    public final String urlConexion =String.format("jdbc:mysql://localhost:3306/%s",db);
    public final String usuario = "usr_empresa";
    public final String contra = "Empres@123";
    public final String jdbc = "com.mysql.cj.jdbc.Drive";
    
    public void abrir_conexion(){
    try{ 
        Class.forName(jdbc);
        
    }catch(Exception ex){
        System.out.println("Error..." + ex.getMessage());
    
    }   
    }
}
