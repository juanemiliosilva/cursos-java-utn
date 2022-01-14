/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscondicionales;

import java.util.Scanner;


public class E12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m, s;
        System.out.println("Ingrese horas");
        h = sc.nextInt();
        System.out.println("Ingrese minutos");
        m = sc.nextInt();
        System.out.println("Ingrese segundos");
        s = sc.nextInt();
        if ((h >= 0) && (m >= 0) && (s >= 0) &&(s < 60) && (m < 60)&&(h < 24) ){
            System.out.println("La horas es: " + h + ":" + m + ":" + s);
        }else { 
            System.out.println("Ingrese numeros de horarios validos");
        }
        
        
        
    }
    
}
