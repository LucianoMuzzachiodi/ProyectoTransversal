package universidadgrupo5.accesoADatos;

import java.sql.*;
import java.time.LocalDate;
import java.util.*;
import javax.swing.*;
import universidadgrupo5.entidades.*;

public class InscripcionData {

    private final Connection con;
    private final MateriaData md = new MateriaData();
    private final AlumnoData ad = new AlumnoData();

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardar(Inscripcion inscripcion) {
        String sql = "INSERT INTO `inscripcion`(`idAlumno`, `idMateria`, `nota`)"
                + " VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(2, inscripcion.getMateria().getIdMateria());
            ps.setDouble(3, inscripcion.getNota());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inscripcion.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripción agregada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla Inscripción. " + ex.getMessage());
        }
    }

    public List<Inscripcion> obtenerInscripcion() {
        List<Inscripcion> inscripciones = new ArrayList<Inscripcion>();

        String sql = "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alumno = ad.buscar(rs.getInt("idAlumno"));
                Materia materia = md.buscar(rs.getInt("IdMateria"));
                inscripcion.setAlumno(alumno);
                inscripcion.setMateria(materia);
                inscripcion.setNota(rs.getDouble("nota"));
                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla Inscripción. " + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        List<Inscripcion> inscripciones = new ArrayList<Inscripcion>();

        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alumno = ad.buscar(rs.getInt("idAlumno"));
                Materia materia = md.buscar(rs.getInt("IdMateria"));
                inscripcion.setAlumno(alumno);
                inscripcion.setMateria(materia);
                inscripcion.setNota(rs.getDouble("nota"));
                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla Inscripción. " + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        List<Materia> materias = new ArrayList<Materia>();

        String sql = "SELECT inscripcion.idMateria, anio, nombre, materia.estado FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("estado"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla Inscripción. " + ex.getMessage());
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNOCursadas(int idAlumno) {
        List<Materia> materias = new ArrayList<Materia>();

        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria NOT IN"
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla Inscripción. " + ex.getMessage());
        }
        return materias;
    }

    public void borrarInscripcionMateria_Alumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Inscripción borrada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla Inscripción. " + ex.getMessage());
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            if(nota >= 0 && nota <= 10){
                ps.setDouble(1, nota);
            }else {
                JOptionPane.showMessageDialog(null, "Recuerde que el puntaje tiene que ser desde el 0 al 10.");
            }
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Nota actualizada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la nota.");
        }
    }

    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
        List<Alumno> alumnos = new ArrayList();

        String sql = "SELECT a.idAlumno,a.dni,a.apellido, a.nombre, a.fechaNacimiento, a.estado FROM alumno a, inscripcion i WHERE a.idAlumno = i.idAlumno AND i.idMateria = " + idMateria;
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno(rs.getInt("idAlumno"), rs.getInt("dni"), rs.getString("apellido"), rs.getString("nombre"), LocalDate.parse(String.valueOf(rs.getDate("fechaNacimiento"))), rs.getBoolean("estado"));
                alumnos.add(alumno);
            }

            ps.close();
            return alumnos;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla Inscripción. ");
            System.err.println(ex);
        }
        return null;
    }
}
