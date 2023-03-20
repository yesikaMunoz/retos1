import java.util.Random;
import java.util.Scanner;

public class reto7 {
    public static void main(String[] args){
        //Declarar variables
        String nombreUsuario;
        int usuario,consola; 
        int numeroVeces,juegosJugados = 0;
        int vidas = 3;
        double sumaB,valorApostado,saldo= 0;
        double sumaA=0;
        double sumaC=0;
        //Instanciar clases
        Scanner lectura=new Scanner(System.in);
        Random signo=new Random();

        System.out.println("Por favor ingresa tu nombre");
        nombreUsuario = lectura.next();
        System.out.println("Ingresa el número de veces que quieres jugar, como máximo 10: ");
        numeroVeces = lectura.nextInt();        

        //Crear la conidición
        if (numeroVeces > 10 || numeroVeces < 0) {
            System.out.println("El número de juegos supera el maximo");
            return;
        }
        System.out.println("Ingresa el saldo a inicial: ");
        saldo = lectura.nextDouble();
        System.out.println("Ingresa el valor que desea apostar: ");
    valorApostado = lectura.nextInt();
        while (vidas > 0 && juegosJugados < numeroVeces) {
        System.out.println("Bienvenido al juego de piedra, papel o tijeras");
        System.out.println("Por favor, seleccione:1. Piedra, 2. Papel,3. Tijeras");
        usuario = lectura.nextInt();  
        if (usuario < 1 || usuario > 3) {
            System.out.println("Opción incorrecta, por favor seleccione 1 o 3");
            return;
        }
        consola = signo.nextInt(3)+1;
        System.out.print("El bot eligio: ");
        switch (consola) {
            case 1:
                System.out.println("Piedra");
                break;
            case 2:
                System.out.println("Papel");
                break;
            case 3:
                System.out.println("Tijeras");
                break;
        }
        if (usuario == consola) {
            System.out.println("Empataron");
            juegosJugados = juegosJugados + 1;
            System.out.println("Has jugado: " + juegosJugados);
        } else if(usuario == 2 && consola == 3 || usuario == 1 && consola == 2 || usuario == 3 && consola == 2){            
            System.out.println("Ganaste venciste a el bot");
            sumaB = valorApostado * 0.3;
            valorApostado = valorApostado + sumaA;
            juegosJugados = juegosJugados + 1;
            saldo = saldo + valorApostado;
            System.out.println("Gracias por jugar: " + nombreUsuario +" su saldo anterior es de: " +saldo+ " ganaste: " +sumaA+ " los has hecho en: " +juegosJugados);
            sumaC = valorApostado + sumaA;
        }else{
            System.out.println("Perdiste el bot te gano");
            sumaB = valorApostado * 0.3;
            valorApostado = valorApostado - sumaB;
            System.out.println("Gracias por jugar: " + nombreUsuario +" su saldo anterior es de: " +saldo+ " perdiste: " +sumaB+ " los has hecho en: " +juegosJugados);
            vidas = vidas - 1;
            System.out.println("Te quedan: "+vidas+" vidas");
            sumaC = valorApostado - sumaB;
        }
        }
            System.out.println("Gano o perdio: " + sumaC);

            System.out.println("Gracias por usar el programa.");
            
            //Limpiar el buffer
            lectura.close();

        }
}
