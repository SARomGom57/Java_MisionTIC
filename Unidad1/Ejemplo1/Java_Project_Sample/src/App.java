public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // definir una variable: tipoVariable nombreVariable = ValorInicial
        int num = 5;
        var num2 = 5.5; // Java infiere el tipo de variable cuando se usa "var"
        String nombre = "Sergio";
        System.out.println(num);
        System.out.println(num2);
        System.out.println(nombre.getClass().getSimpleName());
        System.out.println(((Object) num).getClass().getSimpleName()); // Casting
    }
}