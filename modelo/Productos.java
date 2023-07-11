package modelo;

public class Productos {
        private int id;
        private String Nombre;
        private String Observación;
        private String fecha;

    public Productos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getObservación() {
        return Observación;
    }

    public void setObservación(String Observación) {
        this.Observación = Observación;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
        
        
}
