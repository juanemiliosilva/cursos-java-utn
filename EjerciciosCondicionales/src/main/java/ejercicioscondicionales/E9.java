
package ejercicioscondicionales;

import java.io.IOException;
import java.util.Scanner;


public class E9 {
    public static void main(String[] args) throws IOException  {
        char car;
        System.out.println("Ingrese un caracter");
        Scanner sc = new Scanner(System.in);
        car = (char) System.in.read();
        if (Character.isDigit (car)){
            System.out.println("Es un numero");
        }else { 
            System.out.println("Es una letra");
        }
    }
}
