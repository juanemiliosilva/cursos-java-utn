/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author juanc
 */
public class E6 {public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
            int a=1;
            int nro;
            int exp;
            int rep=1;
//do
            System.out.println("Do");
            System.out.println("Ingrese un numero base:");
            nro=sc.nextInt();
            System.out.println("Ingrese un numero exponente:");
            exp=sc.nextInt();
            do{
                rep=rep*nro;
                a++;
            }while(a<=exp);
            System.out.println("El resultado es: "+rep);
//while
            System.out.println("While");
            System.out.println("Ingrese un numero base:");
            nro=sc.nextInt();
            System.out.println("Ingrese un numero exponente:");
            exp=sc.nextInt();
            while(a<=exp){
                rep=rep*nro;
                a++;
            }
            System.out.println("El resultado es: "+rep);
//for
            System.out.println("While");
            System.out.println("Ingrese un numero base:");
            nro=sc.nextInt();
            System.out.println("Ingrese un numero exponente:");
            exp=sc.nextInt();
            rep=1;
            for(a=1;a<=exp;){
                rep=rep*nro;
                a++;
            }
            System.out.println("El resultado es: "+rep);
}           
}
