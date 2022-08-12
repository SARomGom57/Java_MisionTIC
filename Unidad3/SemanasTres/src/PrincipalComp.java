public class PrincipalComp {
    public static void main(String[] args) {
        LibroComp libro1 = new LibroComp("Introduction to Algorithms", "Tomas Cormen");
        LibroComp libro2 = new LibroComp("The Algorithm Design Manual", "Steven Skiena");
        LibroComp libro3 = new LibroComp("Algorithms", "Kevin Wayne");
        String[] libros = { libro1.titulo, libro2.titulo, libro3.titulo };
        BibliotecaComp biblioteca = new BibliotecaComp(libros);
        String[] librosBiblioteca = biblioteca.getLibros();
        for (String i : librosBiblioteca) {
            System.out.println(i);
        }
    }
}