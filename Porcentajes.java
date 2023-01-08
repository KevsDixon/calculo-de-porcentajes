
package porcentajes;

import java.util.Scanner;

/**
 *
 * @author Kevin Mauricio
 */
public class Porcentajes {
    // Ejercicio de prueba si una camisa cuesta 1000$ pesos obtener el total
    // a pagar si se le aplica el 50% de descuento  y se le agrega el 20% de impuestos

 
    public static void main(String[] args) {
      
        
        
        
              int presio=1000;
      
      double descuento = presio*50/100;
      
      double agregar = presio*20/100;
      
      
        System.out.println("precio orignal es de : "+presio);
        System.out.println("sele aplica el 50% de descuento el cual es : "+descuento);
        System.out.println("y se le agrega el 20% de descuento el cual es : "+agregar);
        
        double presio_final = descuento + agregar;
        System.out.println("el total a pagar final es de : "+presio_final);
        
        // hacer un programa que el usuario defina el numero y el porcentaje a calcular
      
        Scanner Teclado = new Scanner(System.in);
        int x1;
        int x2;
        int x3 = 100;
        int resultado;
        
        System.out.println("digita un numero");
        x1=Teclado.nextInt();
        System.out.println("ingresa el porsentaje a calcular");
        x2=Teclado.nextInt();
        
         
        
        resultado = x1 * x2/x3;
         System.out.println("El porcentaje es : "+ resultado +"%");
        
        
    }
    
}
