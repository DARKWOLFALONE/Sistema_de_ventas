package modelo;

public class Procesos {
    private int id;
    private String Tipo_de_proceso;
    private String Categoria_De_Proceso;
    private String Nombre;
    private String Nombre_Abreviado;
    private String Descripción;
    private String Fecha;

    public Procesos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_de_proceso() {
        return Tipo_de_proceso;
    }

    public void setTipo_de_proceso(String Tipo_de_proceso) {
        this.Tipo_de_proceso = Tipo_de_proceso;
    }

    public String getCategoria_De_Proceso() {
        return Categoria_De_Proceso;
    }

    public void setCategoria_De_Proceso(String Categoria_De_Proceso) {
        this.Categoria_De_Proceso = Categoria_De_Proceso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre_Abreviado() {
        return Nombre_Abreviado;
    }

    public void setNombre_Abreviado(String Nombre_Abreviado) {
        this.Nombre_Abreviado = Nombre_Abreviado;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
}
