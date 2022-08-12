public class Ciclos {
    public static void main(String[] args) {
        int conta = 1;
        while (conta <= 5) {
            System.out.println(conta);
            conta++;
        }
        System.out.println("--------------------------------");
        conta = 1;
        do {
            System.out.println(conta);
            conta++;
        } while (conta <= 5);
        System.out.println("--------------------------------");
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------------------");
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
