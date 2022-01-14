
package tp1;

import java.util.Scanner;


public class CortarNombre {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      System.out.println("Ingrese su nombre y apellido");
      String nombre = s.nextLine();
      int posicion = nombre.indexOf(" ");
      int longitud = nombre.length();
      String nombre2 = nombre.substring(0, posicion);
      String apellido = nombre.substring(posicion, longitud);
      System.out.println("Su nombre es: " + nombre2);
      System.out.println("Su apellido es:" + apellido);
    }
    
}
