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
public class E5 {public static void main(String[] args) {
//do
    System.out.println("Do:");
    int a=1;
    int aux=1;
    do{
        aux=aux*2;
        a++;      
    }while(a<=4);
    System.out.println("2 elevado a 4 es: "+aux);
//while
    System.out.println("While:");
    a=1;
    aux=1;       
    while(a<=4){
    aux=aux*2;
    a++;
    }
    System.out.println("2 elevado a 4 es: "+aux);
//for  
    System.out.println("For:");
    aux=1;
    for(a=1;a<=4;){
        aux=aux * 2;
        a++;    
    }
    System.out.println("2 elevado a 4 es: "+aux);   
}
}
    
