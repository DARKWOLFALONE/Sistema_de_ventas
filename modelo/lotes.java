package modelo;

public class lotes {
    private int id;
    private String Ruta;
    private String Cliente;
    private String Marca;
    private String Tipo_de_Prenda;
    private String Referencia;
    private double Tela;
    private double Peso;
    private int Unidades;
    private String Fecha_Definición;
    private String Fecha_Posible_Despacho;
    private String fecha;

    public lotes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getTipo_de_Prenda() {
        return Tipo_de_Prenda;
    }

    public void setTipo_de_Prenda(String Tipo_de_Prenda) {
        this.Tipo_de_Prenda = Tipo_de_Prenda;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public double getTela() {
        return Tela;
    }

    public void setTela(double Tela) {
        this.Tela = Tela;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public int getUnidades() {
        return Unidades;
    }

    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }

    public String getFecha_Definición() {
        return Fecha_Definición;
    }

    public void setFecha_Definición(String Fecha_Definición) {
        this.Fecha_Definición = Fecha_Definición;
    }

    public String getFecha_Posible_Despacho() {
        return Fecha_Posible_Despacho;
    }

    public void setFecha_Posible_Despacho(String Fecha_Posible_Despacho) {
        this.Fecha_Posible_Despacho = Fecha_Posible_Despacho;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
