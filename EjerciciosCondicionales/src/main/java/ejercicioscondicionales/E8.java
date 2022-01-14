
package ejercicioscondicionales;

import java.io.IOException;
import java.util.Scanner;


public class E8 {
    public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner(System.in); 
      char car1, car2;
      System.out.println("Ingrese el primer caracter");
      car1 = (char) System.in.read();
      System.in.read();
      System.out.println("Ingrese el segundo caracter");
      car2 = (char)System.in.read();
      if  (Character.isUpperCase(car1)){
          if (Character.isUpperCase(car2)){
              System.out.println("Los 2 caracteres estan en mayusculas"); 
          }else{
              System.out.println("El primer caracter esta en mayusculas, el segundo no");
          } 
      }else if (Character.isLowerCase(car2)){
          System.out.println("Los dos caracteres estan en minusculas");  
      }else {
          System.out.println("El primer caracter esta en minusculas, el segundo no");
      }     
}
}