/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package motor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 * Write a description of class Conexion here.
 * 
 * @author Rey Salcedo 
 * @version (a version number or a date)
 */
public class Conexion{
	static Connection conexion;
	static Statement consulta;
	static public final String ruta = "D:\\Mis documentos\\GitHub\\NibbleAN\\codigo\\cookbook.sqlite";

    /**
     * Constructor for objects of class Conexion
     */
    public Conexion()
    {

    }
    public static void conectar(){
		try {
	            Class.forName("org.sqlite.JDBC");
	        }
	        catch (ClassNotFoundException e) {
	            JOptionPane.showMessageDialog(null, e.getMessage());
	        }	 
			try {
                            conexion = DriverManager.getConnection("jdbc:sqlite:"+ruta);
                            consulta = conexion.createStatement();
			} catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
	}
    
}
