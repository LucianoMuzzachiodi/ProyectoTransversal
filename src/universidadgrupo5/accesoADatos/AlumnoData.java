/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo5.accesoADatos;

import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public void guardar(Alumno alumno){
        
        String sql = "INSERT INTO `alumno`(`dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`)"
                       + "VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Alumno buscar(int id){
        Alumno alumnoAxu = new Alumno();
        
        String sql = "SELECT * FROM alumno a WHERE a.idAlumno = "+id;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                alumnoAxu = new Alumno(rs.getInt("idAlumno"),rs.getInt("dni"),rs.getString("apellido"),rs.getString("nombre"),LocalDate.parse(String.valueOf(rs.getDate("fechaNacimiento"))),rs.getBoolean("estado"));
                return alumnoAxu;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return alumnoAxu;
    }
}
