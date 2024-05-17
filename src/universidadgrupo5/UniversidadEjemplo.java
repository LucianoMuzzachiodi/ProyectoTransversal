
package universidadgrupo5;

import universidadgrupo5.accesoADatos.Conexion;
import java.sql.*;
import universidadgrupo5.accesoADatos.AlumnoData;
import universidadgrupo5.accesoADatos.MateriaData;
import universidadgrupo5.entidades.Alumno;
import universidadgrupo5.entidades.Materia;




public class UniversidadEjemplo {

    
    public static void main(String[] args) throws SQLException{
                 
            Connection con = Conexion.getConexion();
            

//           AlumnoData alu = new AlumnoData();

//            Alumno pedro = new Alumno(3129756, "Gatica", "Pedro", LocalDate.of(1994, 10, 18), true);
//            AlumnoData ad = new AlumnoData();
//            System.out.println(ad.buscar(3));
//            ad.guardar(pedro);
           //AlumnoData alu = new AlumnoData();

             

            //AGREGAR ALUMNO
//            Alumno mariam = new Alumno(9, 41968360, "Mini", "Marian", LocalDate.of(2007, 7, 26), true);
//            alu.guardar(mariam);
             


             //BUSCAR POR ID
//             System.out.println(alu.buscar(4));
             
             
             
             //BUSCAR POR DNI
             //System.out.println(alu.buscarDni(42387596));
              
              
             
             //MODIFICAMOS ALUMNO
//             Alumno mariam = new Alumno(9, 41968360, "Mini", "Mariam", LocalDate.of(2007, 7, 26), true);
//             alu.modificar(mariam);
               
             //LISTAMOS ALUMNOS
//            for(Alumno alumno:alu.listarAlumnos()){
//                System.out.println("\nDNI: " + alumno.getDni());
//                System.out.println("Apellido: " + alumno.getApellido());
//                System.out.println("Nombre: " + alumno.getNombre());
//                System.out.println("Fecha de nacimiento: " + alumno.getFechaNac());
//            }
            
               //ELIMINAR ALUMNO
//               alu.eliminarAlumno(5);






//             MATERIADATA


            MateriaData mat = new MateriaData();

//            AGREGAR MATERIA
//            Materia labI = new Materia("Laboratori I", 1, true);
//            mat.guardar(labI);



             //BUSCAR MATERIA
             //System.out.println(mat.buscar(4));
             
             
             
             //MODIFICAR MATERIA
//             Materia webI = new Materia(4, "Web II", 1, true);
//             mat.modificar(webI);



            //ELIMINAR MATERIA
//              mat.eliminarMateria(3);
              
              
              
            //LISTAMOS MATERIAS
//              for(Materia materia:mat.listarMaterias()){
//                  System.out.println("\nId: " + materia.getIdMateria());
//                  System.out.println("Nombre: " + materia.getNombre());
//                  System.out.println("Año: " + materia.getAnio());
//              }
    }
} 