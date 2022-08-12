public class Triangulo extends Area {
    private String figura = "Triangulo";

    public double Area() {
        return dimension1 * dimension2 / 2;
    }

    public static void main(String[] args) {
        Triangulo obj1 = new Triangulo();
        System.out.println(obj1.figura);
        obj1.mostrarDimensiones();
        System.out.println(obj1.Area());
    }
}
