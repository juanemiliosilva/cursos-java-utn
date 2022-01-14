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
public class E8 {
    public static void main(String[] args) {
//while    
        System.out.println("While:");
        int a=1;
        int aux=1;
        while(a<=5){
            aux=aux*a;
            a++;
        }
        System.out.println("El factorial de 5 es: "+aux);
//do
        System.out.println("Do:");
        a=1;
        aux=1;
        do{
            aux=aux*a;
            a++;
        }while(a<=5);
        System.out.println("El factorial de 5 es: "+aux);
//for
        System.out.println("For:");
        aux=1;
        for(a=1;a<=5;a++){
            aux=aux*a;
        }
        System.out.println("El factorial de 5 es: "+aux);
    }
 
}
