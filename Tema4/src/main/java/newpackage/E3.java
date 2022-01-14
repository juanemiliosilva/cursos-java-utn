/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

public class E3 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alum;
        System.out.println("Ingrese el numero de alumnos de su clase: ");
        alum = sc.nextInt();
        double suma = 0;
        double media;
        double[] nros = new double[alum];
        int i;
        for (i = 0; i < alum; i++) {
            System.out.println("Ingrese la nota del alumno " + (i + 1));
            nros[i] = sc.nextDouble();
        }
        for (i = 0; i < nros.length; i++) {
            suma = suma + nros[i];
        }
        media = suma / nros.length;
        System.out.println("La media de notas es: " + media);
        for (i = 0; i < nros.length; i++)
        {
            if (nros[i] > media) {
                System.out.println("El alumno " + (i + 1) + " supera la media con " + nros[i]);
            }
        }
    }
}
