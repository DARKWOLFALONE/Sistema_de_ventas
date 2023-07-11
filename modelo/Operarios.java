package modelo;

public class Operarios {
    private int id;
    private String Nombre;
    private String Tipo_De_Identificación;
    private int Número_De_Identificación;
    private int Télefono;
    private String Dirección;
    private String Correo;
    private String Observación;
    private String Fecha;

    public Operarios() {
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

    public String getTipo_De_Identificación() {
        return Tipo_De_Identificación;
    }

    public void setTipo_De_Identificación(String Tipo_De_Identificación) {
        this.Tipo_De_Identificación = Tipo_De_Identificación;
    }

    public int getNúmero_De_Identificación() {
        return Número_De_Identificación;
    }

    public void setNúmero_De_Identificación(int Número_De_Identificación) {
        this.Número_De_Identificación = Número_De_Identificación;
    }

    public int getTélefono() {
        return Télefono;
    }

    public void setTélefono(int Télefono) {
        this.Télefono = Télefono;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getObservación() {
        return Observación;
    }

    public void setObservación(String Observación) {
        this.Observación = Observación;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
}
