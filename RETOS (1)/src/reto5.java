import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        //Declarar variables
        int cantidadProducto;
        double valorCompra = 0;
        int cantidadProductosReg = 0;
        int precioProducto; 
        String nombre;
        double iva = 0;
        //Instanciar las clases 
        Scanner registro=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de los productos a comprar: ");
        cantidadProducto= registro.nextInt();

        //Crear la condición por while 
        while(cantidadProductosReg < cantidadProducto){
        System.out.println("Digite el nombre del producto");
        nombre = registro.next();
            System.out.println("Ingrese el valor del producto: ");
            precioProducto = registro.nextInt();

            valorCompra =  precioProducto + valorCompra;
            cantidadProductosReg = cantidadProductosReg + 1;
        }

        iva = valorCompra * 0.19;
        valorCompra = valorCompra + iva;
        
        System.out.println("El total de su compra es: " + valorCompra);

        //Limpiar el buffer
        registro.close();

    }
}
