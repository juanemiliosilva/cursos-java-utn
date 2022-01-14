/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un texto");
        String texto = sc.next();
        int contador = 0;
        int i = 0;
        for (i = 0; i < texto.length(); i++) {
            char x = texto.charAt(i);
            if (x == 'A' || x == 'a') {
                contador++;
            }
        }
        System.out.println("La cantidad de a en su texto es de: " + contador);

    }

}
