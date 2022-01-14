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
public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Inserte un numero");
        n =sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("El numero ingresado es par");
        }    else{
            System.out.println("El numero ingresado es impar");
        }
    }
}
