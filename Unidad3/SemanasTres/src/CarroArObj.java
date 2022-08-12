public class CarroArObj {
    private String marca;
    private double precio;

    public CarroArObj(String marca) {
        this.marca = marca;
    }

    public CarroArObj(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }
}
