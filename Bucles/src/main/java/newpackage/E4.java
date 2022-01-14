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
public class E4 {public static void main(String[] args) {
//do    
    int a=1;
    int sum=0;
    System.out.println("Do:");
    do{
        sum=sum+a;
        a++;
    }while(a<=10);
    System.out.println("la suma de todos los numeros entre 1 y 10 es: "+sum);
//while
    System.out.println("While:");
    sum=0;
    a=1;
    while(a<=10){
    sum=sum+a;
    a++;
    }
    System.out.println("la suma de todos los numeros entre 1 y 10 es: "+sum);
//for
    System.out.println("For:");
    a=1;
    sum=0;
    for(a=1;a<=10;a++){
    sum=sum+a;
    }
    System.out.println("la suma de todos los numeros entre 1 y 10 es: "+sum);
}  
}
