public class Secundaria {
    public static void main(String[] args) {
        Principal obj1 = new Principal();
        // System.out.println(obj1.nombre); no se puede acceder porque el atributo es
        // privado
        System.out.println(obj1.getNombre());
        obj1.setNombre("Ana");
        System.out.println(obj1.getNombre());
    }
}
