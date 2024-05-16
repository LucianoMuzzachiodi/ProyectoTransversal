
package universidadgrupo5;

import universidadgrupo5.accesoADatos.Conexion;
import java.sql.*;
import universidadgrupo5.accesoADatos.AlumnoData;
<<<<<<< HEAD
=======
import universidadgrupo5.accesoADatos.MateriaData;
import universidadgrupo5.entidades.Alumno;
import universidadgrupo5.entidades.Materia;
>>>>>>> 366c707f2e542de5d4b0afbd1308dd25299a7010



/**
 *
 * @author Luciano Muzzachiodi
 */
public class UniversidadEjemplo {

    
    public static void main(String[] args) throws SQLException{
                 
            Connection con = Conexion.getConexion();
            
//            Alumno pedro = new Alumno(3129756, "Gatica", "Pedro", LocalDate.of(1994, 10, 18), true);
            AlumnoData ad = new AlumnoData();
            System.out.println(ad.buscar(3));
//            ad.guardar(pedro);
<<<<<<< HEAD
=======
           //AlumnoData alu = new AlumnoData();
             

            //AGREGAR ALUMNO
//            Alumno mariam = new Alumno(9, 41968360, "Mini", "Marian", LocalDate.of(2007, 7, 26), true);
//            alu.guardar(mariam);
             


             //BUSCAR POR ID
             //System.out.println(alu.buscar(3));
             
             
             
             //BUSCAR POR DNI
             //System.out.println(alu.buscarDni(42387596));
              
              
             
             //MODIFICAMOS ALUMNO
//             Alumno mariam = new Alumno(9, 41968360, "Mini", "Lucia", LocalDate.of(2007, 7, 26), true);
//             alu.modificar(mariam);
               
             //LISTAMOS ALUMNOS
//            for(Alumno alumno:alu.listarAlumnos()){
//                System.out.println("\nDNI: " + alumno.getDni());
//                System.out.println("Apellido: " + alumno.getApellido());
//                System.out.println("Nombre: " + alumno.getNombre());
//                System.out.println("Fecha de nacimiento: " + alumno.getFechaNac());
//            }
            




            MateriaData mat = new MateriaData();

//            AGREGAR MATERIA
//            Materia labI = new Materia("Laboratori I", 1, true);
//            mat.guardar(labI);



             //BUSCAR MATERIA
             //System.out.println(mat.buscar(4));
             
             
             
             
             
             
             
            
              

>>>>>>> 366c707f2e542de5d4b0afbd1308dd25299a7010
            
            
            
            
            
            
            
            
            
            
            
            
            

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
