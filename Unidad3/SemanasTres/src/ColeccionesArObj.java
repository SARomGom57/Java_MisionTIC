public class ColeccionesArObj {
    public static void main(String[] args) {
        CarroArObj[] carros = new CarroArObj[2];
        carros[0] = new CarroArObj("Chevrolet", 50000000.0);
        carros[1] = new CarroArObj("Nissan", 85000000.0);
        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i].getMarca() + " - " + carros[i].getPrecio());
        }
    }
}