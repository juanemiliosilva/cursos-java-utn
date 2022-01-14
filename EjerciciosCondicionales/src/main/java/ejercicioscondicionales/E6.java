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
public class E6 {
    public static void main(String[] args) {
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("La clave es a/b");
        System.out.println("Ingrese el numero a");
        a = sc.nextFloat();
        System.out.println("Ingrese el numero b");
        b = sc.nextFloat();
        if (b ==0){
            System.out.println("No se puede realizar la division");
            
        }else{
            c = a / b;
            System.out.println("La clave es: " + c);
        }
        
        
        
               
    }
}
