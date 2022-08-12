import java.util.Scanner;

public class ConMuta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero del mes");
        int mes = sc.nextInt();
        sc.close();
        String mesLetra = "";
        switch (mes) {
            case 1:
                mesLetra = "Enero";
                break;
            case 2:
                mesLetra = "Febrero";
                break;
            case 3:
                mesLetra = "Marzo";
                break;
            case 4:
                mesLetra = "Abril";
                break;
            case 5:
                mesLetra = "Mayo";
                break;
            case 6:
                mesLetra = "Junio";
                break;
            case 7:
                mesLetra = "Julio";
                break;
            case 8:
                mesLetra = "Agosto";
                break;
            case 9:
                mesLetra = "Septiembre";
                break;
            case 10:
                mesLetra = "Octubre";
                break;
            case 11:
                mesLetra = "Noviembre";
                break;
            case 12:
                mesLetra = "Diciembre";
                break;
            default:
                System.out.println("Digite un mes valido");
        }
        System.out.println("El mes es " + mesLetra);
    }
}
