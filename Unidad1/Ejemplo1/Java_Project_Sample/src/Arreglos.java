public class Arreglos {
    public static void main(String[] args) {
        String[] ciudades = { "Cali", "Medellin", "Monteria", "Bogota" };
        int[] numeros = { 45, 21, 80, 10, 56 };
        System.out.println(ciudades[2]);
        System.out.println(ciudades.length);
        //
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println(ciudades[i]);
        }
        //
        for (String city : ciudades) {
            System.out.println(city);
        }
        for (int num : numeros) {
            System.out.println(num);
        }
        // Array en dos dimensiones
        int[][] matriz = { { 45, 25, 89 }, { 26, 32, 77 } };
        // Recorrido de un array bidimensional con un for
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
        System.out.println("---------------------------------------------");
        // Recorrido de un array bidimensional con un for each
        for (int[] x : matriz) {
            for (int y : x) {
                System.out.println(y);
            }
        }
    }
}
