import java.util.Random;
import java.util.Scanner;
public class reto8 { 
    public static void main(String[] args) { 
        // Generamos un número aleatorio del 1 al 100 
        Scanner lectura = new Scanner(System.in); 
        Random rand = new Random(); 
        int numeroAdivinar = rand.nextInt(100) + 1;  
        int intentos = 10; 
        int numeroIntento; 
        while (intentos > 0) { 
            System.out.print("Ingresa un número (TE QUEDAN" +intentos+ "INTENTOS)" ); 
            numeroIntento = lectura.nextInt();
            if (numeroIntento == numeroAdivinar) { 
                System.out.println("¡Adivinaste el número!"); 
                System.out.println("Te tomó" +  intentos + " intentos."); 
            } else if (numeroIntento < numeroAdivinar) { 
                System.out.println("El número a adivinar es mayor."); 
            } else { 
                System.out.println("El número a adivinar es menor."); 
            } 
            intentos--; 
        } 
        if (intentos == 0) { 
            System.out.println("Lo siento, no lograste adivinar el número."); 
            System.out.println("El número a adivinar era: " + numeroAdivinar); 
        } 
        lectura.close();

    } 

 

} 
