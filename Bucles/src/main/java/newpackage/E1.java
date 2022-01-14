/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;


public class E1 {public static void main(String[] args) {
    int a=1;
            System.out.println("While");
//while   
    while(a<=5){
        System.out.println(a);
        a=a+1;
    }
            System.out.println("Do:");
    a=1;
//do
    do{
        System.out.println(a);
        a=a+1;
    }while(a<=5);
            System.out.println("For:");
//for
    for(a=1; a<=5; a++){
        System.out.println(a);
}
}
}