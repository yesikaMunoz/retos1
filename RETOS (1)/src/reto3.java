import java.util.Random;
import java.util.Scanner;

public class reto3 {
     //crear metodo
     public static void main(String[] args) {
        //declracion de variables 
        String nombreJugador;
        int montoInicial=20000;
        double montoApuesta;
        double montoTotal;
        String resultadoJuego;
  
          Scanner Registro=new Scanner(System.in);
          System.out.println("Digite su nombre ");
          nombreJugador=Registro.next();
          System.out.println("Hola " +nombreJugador + " tu monto incial es de "+montoInicial);
          System.out.println("Digite el valor que quiere apostar ");
          montoApuesta=Registro.nextDouble();
            System.out.println("Digite cara o sello ");
          String eleccion=Registro.next();
          montoTotal=montoApuesta-montoInicial;
  
           Random rand=new Random();
           //genera numeros aleatorios entre 0 y 1
           int resultadoLanzamiento=rand.nextInt (2); 
           if (resultadoLanzamiento==0){
              resultadoJuego= "cara" ;
           } else {
              resultadoJuego="sello";
              
           }
           if (eleccion.equalsIgnoreCase(resultadoJuego)) {
              System.out.println("Ganasta la moneda cayo en " +resultadoJuego+ " y la maquina perdio  ");
               
           }else {
              System.out.println("Perdiste la moneda cayo en " +resultadoJuego+ " y la maquina gano "+montoTotal);
           }
           //limpiar bufer
           Registro.close();
      }
}
