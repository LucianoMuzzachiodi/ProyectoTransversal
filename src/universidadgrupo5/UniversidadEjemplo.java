
package universidadgrupo5;

import universidadgrupo5.accesoADatos.Conexion;
import java.sql.*;
import java.time.LocalDate;
import universidadgrupo5.accesoADatos.*;
import universidadgrupo5.entidades.*;




public class UniversidadEjemplo {

    
    public static void main(String[] args) throws SQLException{
                 
            Connection con = Conexion.getConexion();
            
           
//            AlumnoData alu = new AlumnoData();

             

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


//            MateriaData mat = new MateriaData();

//            AGREGAR MATERIA
//            Materia labI = new Materia("Laboratori I", 1, true);
//            mat.guardar(labI);



             //BUSCAR MATERIA
             //System.out.println(mat.buscar(4));
             
             
             
             //MODIFICAR MATERIA
//             Materia webII = new Materia(4, "Web II", 2, false);
//             mat.modificar(webII);



            //ELIMINAR MATERIA
//              mat.eliminarMateria(3);
              
              
              
            //LISTAMOS MATERIAS
//              for(Materia materia:mat.listarMaterias()){
//                  System.out.println("\nId: " + materia.getIdMateria());
//                  System.out.println("Nombre: " + materia.getNombre());
//                  System.out.println("Año: " + materia.getAnio());
//              }






        // INSCRIPCIÓNDATA
        
//        AlumnoData ad = new AlumnoData();
//        MateriaData md = new MateriaData();
//        InscripcionData id = new InscripcionData();
//        
//        // REGISTRAR UNA INSCRIPCIÓN
//        id.guardar(new Inscripcion(ad.buscar(3),md.buscar(3),5));
//        
//        // LISTAR INSCRIPCIONES
//        for (Inscripcion inscripcion : id.obtenerInscripcion()) {
//            if(inscripcion != null){System.out.println(inscripcion);}
//        }
//        
//        // LISTAR INSCRIPCIONES POR ALUMNO
//        for (Inscripcion inscripcion : id.obtenerInscripcionesPorAlumno(3)) {
//            if(inscripcion != null){System.out.println(inscripcion);}
//        }
//        
//        // LISTAR MATERIAS CURSADAS
//        for (Materia materia : id.obtenerMateriasCursadas(3)) {
//            if(materia != null){System.out.println(materia);}
//        }
//        
//        // LISTAR MATERIAS NO CURSADAS
//        for (Materia materia : id.obtenerMateriasNOCursadas(5)) {
//            System.out.println(materia);
//        }
//        
//        // ACTUALIZAR NOTA
//        id.actualizarNota(3, 3, 7);
//        
//        // LISTAR ALUMNOS
//        for (Alumno alumno : id.obtenerAlumnosXMateria(3)) {
//            if(alumno != null){System.out.println(alumno);}
//        }
//        
//        // BORRAR UNA INSCRIPCIÓN DE UN ALUMNO EN ALGUNA MATERIA
//        id.borrarInscripcionMateria_Alumno(3, 3);
    }
}