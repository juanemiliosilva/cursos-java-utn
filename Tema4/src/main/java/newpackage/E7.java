/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

public class E7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nom = new String[20];
        double[] sueldos = new double[20];
        String mayorsueldonbre;
        double mayorsueldonro;
        int i = 0;
//Codigo           
        System.out.println("Ingrese el nombre del empleado " + (i + 1));
        nom[i] = sc.nextLine();
        System.out.println("Ingrese el sueldo del empleado " + (i + 1));
        sueldos[i] = sc.nextDouble();
        mayorsueldonbre = nom[i];
        mayorsueldonro = sueldos[i];
        for (i = 1; i < nom.length; i++) {
            sc.nextLine();
            System.out.println("Ingrese el nombre del empleado " + (i + 1));
            nom[i] = sc.nextLine();
            System.out.println("Ingrese el sueldo del empleado " + (i + 1));
            sueldos[i] = sc.nextDouble();
            if (sueldos[i] > mayorsueldonro) {
                mayorsueldonbre = nom[i];
                mayorsueldonro = sueldos[i];
            }
        }
        System.out.println("El empleado con mas sueldo es: " + mayorsueldonbre);
        System.out.println("Y su sueldo es de: " + mayorsueldonro);
    }
}
