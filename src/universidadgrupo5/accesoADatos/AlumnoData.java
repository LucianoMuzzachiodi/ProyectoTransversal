/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo5.accesoADatos;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgrupo5.entidades.Alumno;

/**
 *
 * @author Luciano Muzzachiodi
 */
public class AlumnoData {
    private Connection con;
    
    public AlumnoData(){
        
        con = Conexion.getConexion();
    }
    
    
    
    //GUARDAR UN ALUMNO
    public void guardar(Alumno alumno){
        
        String sql = "INSERT INTO `alumno`(`dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`)"
                       + "VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno agregado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla alumno");
        }
        
    }
    
    
    
    //MODIFICAR UN ALUMNO
    public void modificar(Alumno alumno){
   
        String sql = "UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ?"
                + "WHERE idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Alumno modificado");
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }
    
    
    
    //BUSCAR UN ALUMNO POR ID
    public Alumno buscar(int id){
        Alumno alumnoAxu = new Alumno();
        
        String sql = "SELECT * FROM alumno a WHERE a.idAlumno = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                alumnoAxu = new Alumno(rs.getInt("idAlumno"),rs.getInt("dni"),rs.getString("apellido"),rs.getString("nombre"),LocalDate.parse(String.valueOf(rs.getDate("fechaNacimiento"))),rs.getBoolean("estado"));
               
            }else{
                JOptionPane.showMessageDialog(null, "No existe el alumno con ese Id");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
        return alumnoAxu;
    }
    
    
    
    //BUSCAR UN ALUMNOI POR DNI
    public Alumno buscarDni(int dni){
        Alumno alumnoAxu = new Alumno();
        
        String sql = "SELECT * FROM alumno a WHERE dni = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                alumnoAxu = new Alumno(rs.getInt("idAlumno"),rs.getInt("dni"),rs.getString("apellido"),rs.getString("nombre"),LocalDate.parse(String.valueOf(rs.getDate("fechaNacimiento"))),rs.getBoolean("estado"));
               
            }else{
                JOptionPane.showMessageDialog(null, "No existe el alumno con ese DNI");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
        return alumnoAxu;
    }
    
    
    
    //LISTAR ALUMNOS ACTIVOS
    public List<Alumno> listarAlumnos(){
        ArrayList<Alumno> alumnoAxu = new ArrayList<>();
        
        String sql = "SELECT * FROM alumno a WHERE estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
               Alumno alumno = new Alumno(rs.getInt("idAlumno"),rs.getInt("dni"),rs.getString("apellido"),rs.getString("nombre"),LocalDate.parse(String.valueOf(rs.getDate("fechaNacimiento"))),rs.getBoolean("estado"));
               alumnoAxu.add(alumno);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
        return alumnoAxu;
    }
    
    public void eliminarAlumno(int id) {
        try {
            String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate();
            if(fila == 1){
                JOptionPane.showMessageDialog(null, " Se eliminó el alumno.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");
        }
    }
}
