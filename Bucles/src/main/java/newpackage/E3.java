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
public class E3 {public static void main(String[] args) {
//while
    int a;
    int cont;
    cont=0;
    a=10;
    System.out.println("While:");
    while(a<=70){
        a++;
        if(a%4==0){
            cont++;
        }           
    }
    System.out.println("multiplos de 4: "+cont);
//do
    System.out.println("Do:");
    a=10;
    cont=0;
    do{
        a++;
        if(a%4==0){
            cont++;
        }
    }while(a<=70);
    System.out.println("multiplos de 4: "+cont);
//for
    System.out.println("For:");
    cont=0;
    for(a=10;a<=70;a++){
        if(a%4==0){
            cont++;
        }
    }
    System.out.println("multiplos de 4: "+cont);
}
}