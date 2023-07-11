package modelo;
public class insumos {
    private int id;
    private String Nombre;
    private String Tipo_de_productos;
    private String Unidades;
    private String Tipo_de_prestación;
    private String Observación;
    private String fecha;

    public insumos() {
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

    public String getTipo_de_productos() {
        return Tipo_de_productos;
    }

    public void setTipo_de_productos(String Tipo_de_productos) {
        this.Tipo_de_productos = Tipo_de_productos;
    }

    public String getUnidades() {
        return Unidades;
    }

    public void setUnidades(String Unidades) {
        this.Unidades = Unidades;
    }

    public String getTipo_de_prestación() {
        return Tipo_de_prestación;
    }

    public void setTipo_de_prestación(String Tipo_de_prestación) {
        this.Tipo_de_prestación = Tipo_de_prestación;
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
