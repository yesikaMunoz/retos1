import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {

        double peso;
        int meses;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el peso del bebé en kg: ");
         peso = lectura.nextDouble();
        System.out.print("Ingrese la edad del bebé en meses: ");
         meses = lectura.nextInt();

        double dosisVacuna = peso + 10.0/meses * 10 * 8;

        System.out.println("La dosis de la vacuna es de " + dosisVacuna + " ml.");

        lectura.close();
    }
}
