public class Condicional {
    public static void main(String[] args) {
        int nota = 90;
        if (nota >= 60 && nota <= 80) {
            System.out.println("Bueno");
        } else if (nota > 80) {
            System.out.println("Excelente");
        } else {
            System.out.println("No Aprobo");
        }
    }
}
