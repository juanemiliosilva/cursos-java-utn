/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas:");
        int nroper = sc.nextInt();
        double[] alt = new double[nroper];
        int may = 0, men = 0;
        double media = 0;
        int i;
        for (i = 0; i < alt.length; i++) {
            System.out.println("Ingrese la altura de la persona " + (i + 1));
            alt[i] = sc.nextDouble();
            media = media + alt[i];
        }
        media = media / nroper;
        for (i = 0; i < alt.length; i++) {
            if (alt[i] > media) {
                may++;
            } else {
                men++;
            }
        }
        System.out.println("La altura promedio es: " + media);
        System.out.println("La cantidad de personas mayor al promedio es: " + may);
        System.out.println("La cantidad de personas mayor al promedio es: " + men);
    }
}
