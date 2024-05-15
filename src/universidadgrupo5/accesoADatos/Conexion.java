/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo5.accesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciano Muzzachiodi
 */
public class Conexion {
    private static final String URL="jdbc:mariadb://localhost:3306/";
    private static final String DB="universidadgrupo5";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;

    private Conexion(){}
   
    public static Connection getConexion() {

      if(connection == null){
          
           try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
            
            JOptionPane.showMessageDialog(null, "Conectado");
            
           } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los Driver");
           } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
          }
        }
      return connection;
      }
    }