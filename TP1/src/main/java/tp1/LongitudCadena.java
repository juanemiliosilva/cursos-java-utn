
package tp1;

import java.util.Scanner;




public class LongitudCadena {
    public static void main(String[] args) {
        System.out.println("Ingrese una palabra");
        Scanner s = new Scanner (System.in);
        String texto = s.nextLine();
        int longitud = texto.length();
                System.out.println("Su resultado es " + longitud);
    }
}
