import java.util.Scanner;

public class Ejercicio2 {
    public void CanturaDatos() {
        Scanner num = new Scanner(System.in);
        int tabla;
        do {
            System.out.println("Digite la tabla de multiplicar que desea");
            tabla = num.nextInt();
            if (tabla != -1) {
                MostrarTabla(tabla);
            }
        } while (tabla != -1);
        num.close();
    }

    public void MostrarTabla(int valor) {
        for (int i = 1; i < 11; i++) {
            System.out.println(valor + " * " + i + " = " + valor * i);
        }
    }

    public static void main(String[] args) {
        Ejercicio2 tabla1 = new Ejercicio2();
        tabla1.CanturaDatos();
    }
}