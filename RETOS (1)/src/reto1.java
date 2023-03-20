import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
         fahrenheit = lectura.nextDouble();
         celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " grados Fahrenheit equivalen a " + celsius + " grados Celsius.");
   
        lectura.close();
    }
}
    

