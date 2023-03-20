import java.util.Random;
import java.util.Scanner;

public class reto6 {
    public static void main(String[] args) {
        //Declarar variables
        String nombreUsuario;
        int usuario,bot; 
        int numeroRepeticiones,juegosJugados = 0;
        int vidas = 3;
        double sumaA,valorApostado,saldo = 0;
        double sumaB=0;
        double sumaC=0;
        //Instanciar clases
        Scanner lectura =new Scanner(System.in);
        Random rand=new Random();

        System.out.println("Por favor digite su nombre");
        nombreUsuario = lectura.next();
        System.out.println("Digite el numero de veces que quieres jugar máximo 10: ");
        numeroRepeticiones = lectura.nextInt();   
        
        //Crear la condición
        if (numeroRepeticiones > 10 || numeroRepeticiones < 0) {
            System.out.println("El numero de veces excede el maximo acordado");
            return;
        }
        System.out.println("digite el saldo a inicial: ");
        saldo = lectura.nextDouble();
        System.out.println("digite el valor que desea apostar: ");
        valorApostado = lectura.nextInt();
        while (vidas > 0 && juegosJugados < numeroRepeticiones) {    
        System.out.println("Bienvenido al juego de Cara o Sello");
        System.out.println("Por favor, seleccione:1. Cara,2. Sello");
        usuario = lectura.nextInt();
        if (usuario < 1 || usuario > 2) {
            System.out.println("Opción incorrecta. Por favor seleccione 1 o 2.");
            return;
        }

        bot = rand.nextInt(2) + 1;

        System.out.print("Cayó: ");

        switch (bot) {
            case 1:
                System.out.println("Cara");
                break;
            case 2:
                System.out.println("Sello");
                break;
        }

        if (usuario == bot) {
            System.out.println("Ganaste venciste la maquina");
            sumaA = valorApostado * 0.1;
            valorApostado = valorApostado + sumaA;
            System.out.println("Has ganado: " + valorApostado);
            saldo = saldo + valorApostado;
            System.out.println("Tu saldo es: " + saldo);
            juegosJugados = juegosJugados + 1;
            System.out.println("Usted ha jugado: "+ juegosJugados);
            sumaC = sumaC + sumaA;
        } else {            
            System.out.println("Perdiste la maquina te vencio");
            sumaB = valorApostado * 0.1;
            valorApostado = valorApostado - sumaB;
            System.out.println("Gracias por jugar: " + nombreUsuario + " perdido: "+sumaB);
            vidas = vidas - 1;
            saldo = saldo - valorApostado;
            System.out.println("Tu saldo es de: " + saldo);
            System.out.println("Te quedan: " + vidas + " vidas");
            juegosJugados = juegosJugados + 1;
            System.out.println("Has jugado: "+ juegosJugados);
            sumaC = sumaC - sumaB;
        }
        }
            System.out.println("Gano o perdio: " + sumaC);

            //Limpiar el buffer
            lectura.close();

    }
}
