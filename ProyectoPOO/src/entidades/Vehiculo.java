package entidades;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int precio;
    private int cantidad;
    private int total = 0;
    public Vehiculo(String marca, String modelo, String color, int cantidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantidad = cantidad;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public void setSumaTotal(int cantidad, int precio) {
        setTotal(total + (cantidad * precio));
    }
    public String getNombreCompleto() {
        return getMarca() + " " + getModelo();
    }
    public String getDetalle() {
        return "Item: " + getNombreCompleto();
    }
}