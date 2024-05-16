/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo5.accesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;
import universidadgrupo5.entidades.Materia;

/**
 *
 * @author Luciano Muzzachiodi
 */
public class MateriaData {
    private Connection con;

    public MateriaData(){
        
        con = Conexion.getConexion();
    }
    
    
    
    //GUARDAR UNA MATERIA
    public void guardar(Materia materia){
        
        String sql = "INSERT INTO `materia`(`nombre`, `anio`, `estado`)"
                       + "VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia agregada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla materia");
        }
        
    }
    
    
    
    //BUSCAR UNA MATERIA
    public Materia buscar(int id){
        Materia materiaAxu = new Materia();
        
        String sql = "SELECT * FROM `materia` WHERE idMateria = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                materiaAxu = new Materia(rs.getInt("idMateria"), rs.getString("nombre"), rs.getInt("anio"), rs.getBoolean("estado"));
               
            }else{
                JOptionPane.showMessageDialog(null, "No existe la materia con ese ID");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        
        return materiaAxu;
    }
    
    
    
    //MODIFICAR UNA MATERIA
    public void modificar(Materia materia){
   
        String sql = "UPDATE materia SET  nombre = ?, anio = ?, estado = ?"
              + "WHERE idMateria = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Materia modificada");
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia" + ex);
        }
    }
}
