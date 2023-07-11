package modelo;
public class Clientes {
    private int id;
    private String Nombre;
    private int TipoDeVendedor;
    private String Vendedor;
    private String NombreDeContacto;
    private int Telefono;
    private String Correo;
    private String fecha;

    public Clientes() {
    }

    public Clientes(int id, String Nombre, int TipoDeVendedor, String Vendedor, String NombreDeContacto, int Telefono, String Correo, String fecha) {
        this.id = id;
        this.Nombre = Nombre;
        this.TipoDeVendedor = TipoDeVendedor;
        this.Vendedor = Vendedor;
        this.NombreDeContacto = NombreDeContacto;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.fecha = fecha;
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

    public int getTipoDeVendedor() {
        return TipoDeVendedor;
    }

    public void setTipoDeVendedor(int TipoDeVendedor) {
        this.TipoDeVendedor = TipoDeVendedor;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getNombreDeContacto() {
        return NombreDeContacto;
    }

    public void setNombreDeContacto(String NombreDeContacto) {
        this.NombreDeContacto = NombreDeContacto;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
