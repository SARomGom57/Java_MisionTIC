public class Excepciones2 {
    public static void main(String[] args) {
        chequearEdad(10);
    }
    public static void chequearEdad(int edad){
        if (edad > 18){
            System.out.println("Acceso Permitido");
        }else{
            throw new ArithmeticException("Acceso Denegado");
        }
        System.err.println("Estuve aqui"); 
    }
}