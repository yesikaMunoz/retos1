import java.util.Random;
import java.util.Scanner;

public class reto4 {

    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        Random ramdoms = new Random();
        
        int opcionJugador, opcionMaquina;
        
        System.out.println("¡Bienvenido al juego de piedra, papel o tijera!");
        System.out.println("1. Piedra,2. Papel;3. Tijera, Elige tu opción (1-3):");
        opcionJugador = lectura.nextInt();
        
        opcionMaquina = ramdoms.nextInt(3) + 1;
        
            switch (opcionJugador) {
            case 1: // Piedra
                if (opcionMaquina == 1) {
                    System.out.println("Empate");
                } else if (opcionMaquina == 2) {
                    System.out.println("Gana la máquina");
                } else if (opcionMaquina == 3) {
                    System.out.println("Gana el jugador");
                }
                break;
            case 2: // Papel
                if (opcionMaquina == 1) {
                    System.out.println("Gana el jugador");
                } else if (opcionMaquina == 2) {
                    System.out.println("Empate");
                } else if (opcionMaquina == 3) {
                    System.out.println("Gana la máquina");
                }
                break;
            case 3: // Tijera
                if (opcionMaquina == 1) {
                    System.out.println("Gana la máquina");
                } else if (opcionMaquina == 2) {
                    System.out.println("Gana el jugador");
                } else if (opcionMaquina == 3) {
                    System.out.println("Empate");
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        lectura.close();
    }
}

