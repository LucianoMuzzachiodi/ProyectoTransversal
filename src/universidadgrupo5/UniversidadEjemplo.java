
package universidadgrupo5;

import universidadgrupo5.accesoADatos.Conexion;
import java.sql.*;
import universidadgrupo5.accesoADatos.AlumnoData;



/**
 *
 * @author Luciano Muzzachiodi
 */
public class UniversidadEjemplo {

    
    public static void main(String[] args) throws SQLException{
                 
            Connection con = Conexion.getConexion();
            
//            Alumno pedro = new Alumno(3129756, "Gatica", "Pedro", LocalDate.of(1994, 10, 18), true);
            AlumnoData ad = new AlumnoData();
            
//            ad.guardar(pedro);
            
            
            
            
            
            
            
            
            
            
            
            
            

//            String sql="INSERT INTO alumno(`dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`) "
//                    + "VALUES (31201637, 'Muzzachiodi', 'Luciano', '1984-10-16', true), (42387596, 'Lopez', 'Ezequiel', '1997-05-28', '1'), (45986723, 'Amaya', 'Daniela', '1999-10-30', '1')";
//            
//            PreparedStatement ps=con.prepareStatement(sql);
//
//            String sql="INSERT INTO `materia`(`nombre`, `año`, `estado`)" + "VALUES ('Matemáticas','1','1'), ('Laboratorio II', '2', '1'),('Ingles II', '3', '1'),('Web II', '2', '1')";
//
//            PreparedStatement ps = con.prepareStatement(sql);
//
//
//            String sql = "INSERT INTO `inscripcion`(`nota`, `idAlumno`, `idMateria`)" + " VALUES ('10','3','2'),('9', '3', '1'), ('9', '4', '2'), ('10', '4', '3'), ('8', '5', '3')('10', '5', '4')";
//            
//            PreparedStatement ps = con.prepareStatement(sql);
//
//            ps.executeUpdate();
//            int nota = 8;
//            String sql="SELECT * FROM alumno a JOIN inscripcion i on(a.idAlumno = i.idAlumno) WHERE nota > ?";
//            
//            PreparedStatement st = con.prepareStatement(sql);
//              st.setInt(1, nota);
//              ResultSet rs= st.executeQuery();
//    
//              while (rs.next()){
//                  System.out.println("\nDNI : "+ rs.getInt("dni"));
//                  System.out.println("Apellido: " + rs.getString("apellido"));
//                  System.out.println("Nombre: " + rs.getString("nombre"));
//                  System.out.println("Fecha de nacimiento: " + rs.getDate("fechaNacimiento"));
//                  System.out.println("Estado: " + rs.getBoolean("estado"));
//                  System.out.println("Nota: " + rs.getInt("nota"));
//              }
//              String sql = "DELETE FROM `inscripcion` WHERE idInscripto = 17";
//              
//              PreparedStatement st = con.prepareStatement(sql);
//              st.executeUpdate();      
    }
}
