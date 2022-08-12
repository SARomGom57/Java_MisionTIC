public class Main {
    public static void main(String[] args) { 
        // Pruebas Públicas 
        Computadores computadores1[] = new Computadores[6]; 
        computadores1[0] = new Computadores(150.0, 70, 'A'); 
        computadores1[1] = new ComputadoresMesa(70.0, 40); 
        computadores1[2] = new ComputadoresPortatiles(600.0, 70, 'D', 50, false); 
        computadores1[3] = new Computadores(); 
        computadores1[4] = new Computadores(500.0, 60, 'A'); 
        computadores1[5] = new Computadores(700.0, 50, 'D'); 
        PrecioTotal solucion1 = new PrecioTotal(computadores1); 
        solucion1.mostrarTotales(); 
        System.out.println(); 
 
        Computadores computadores2[] = new Computadores[4]; 
        computadores2[0] = new Computadores(60.0, 10, 'D'); 
        computadores2[1] = new ComputadoresMesa(300.0, 40, 'Z', 40); 
        computadores2[2] = new ComputadoresPortatiles(50.0, 10, 'A', 70, false); 
        computadores2[3] = new Computadores(50.0, 10); 
        PrecioTotal solucion2 = new PrecioTotal(computadores2); 
        solucion2.mostrarTotales(); 
        System.out.println();
    }
}
