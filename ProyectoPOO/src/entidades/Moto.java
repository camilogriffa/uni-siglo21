package entidades;

public class Moto extends Vehiculo {
    private String tipo;
    public Moto(String marca, String modelo, String color, String tipo, int cantidad) {
        super(marca, modelo, color, cantidad);
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDetalle() {
        return "Item: " + getNombreCompleto() +
                " - Tipo: " + getTipo();
    }
}