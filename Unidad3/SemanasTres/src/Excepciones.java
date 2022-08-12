public class Excepciones {
    public static void main(String[] args){
        try{
            int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
            System.out.println(numeros[10]);
        }
        catch(Exception e){
            System.out.println("Indice fuera de rango");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Esto siempre pasa");
        }   
    }
}
