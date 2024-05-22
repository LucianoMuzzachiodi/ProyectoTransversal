package universidadgrupo5.entidades;
public class Materia {
    private int idMateria;
    private String nombre;
    private int anio;
    private boolean estado;

    public Materia() {}

    public Materia(int idMateria, String nombre, int anio, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

    public Materia(String nombre, int anio, boolean estado) {
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
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
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String activo;
//        if(this.estado){activo = "Activo";}else{activo = "Inactivo";}
        if(estado){activo = "Activo";}else{activo = "Inactivo";}
        return "\nID: "+idMateria
                + "\nMateria: "+nombre
                + "\nAño: "+anio
                + "\nEstado: " + activo;
    }
}
