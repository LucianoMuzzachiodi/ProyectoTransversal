package universidadgrupo5.entidades;
public class Materia {
    private int idMateria, anio;
    private String nombre;
    private boolean activo;

    public Materia() {}

    public Materia(int idMateria, String nombre, int anio, boolean activo) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
        this.activo = activo;
    }

    public Materia(String nombre, int anio, boolean activo) {
        this.nombre = nombre;
        this.anio = anio;
        this.activo = activo;
    }

    public int getIdMateria() {
        return idMateria;
    }
    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        String estado;
        if(this.activo){estado = "Activa";}else{estado = "Inactiva";}
        return "\nID: "+idMateria
                + "\nMateria: "+nombre
                + "\nAño: "+anio
                + "\nEstado: " + estado;
    }
}
