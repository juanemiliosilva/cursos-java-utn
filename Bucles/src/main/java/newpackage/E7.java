/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author juanc
 */
public class E7 {public static void main(String[] args) {
            int a=1;
            int sum=0;
//do
            System.out.println("Do:");
            do{
                sum=sum+a;
                a++;
            }while(a<=7);
            System.out.println("4 por 7 es: "+sum);
//while
            System.out.println("While:");
            a=1;
            sum=0;
            while(a<=7){
                sum=sum+a;
                a++;
            }
            System.out.println("4 por 7 es: "+sum);
//for
            System.out.println("For:");
            sum=0;
            for(a=1;a<=7;){
                sum=sum+a;
                a++;
            }
            System.out.println("4 por 7 es: "+sum);
}   
}
