/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscondicionales;

import java.util.Scanner;

/**
 *
 * @author juanc
 */
public class E2 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
      Scanner sc = new Scanner(System.in);
      int n;
      n = sc.nextInt();
      if (n % 10 == 0){
          System.out.println("Su numero es multiplo de 10");
          
      } else{
          System.out.println("Su numero no es multiplo de 10");
      }
    }
    
}
