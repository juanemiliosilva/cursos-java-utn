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
public class E2 {
    public static void main(String[] args) {
        int a = 1;
// while
    System.out.println("While:");
    while (a<=100){
        System.out.println(a);
    if (a==5){
        break;
    }
    a++;
    }
//do
    System.out.println("Do:");
    a=1;
    do{
        System.out.println(a);
        if (a==5){break;
        }
        a++;
    }while (a<=100);
//for
        System.out.println("For:");
    for (a=1;a<=100;){
        System.out.println(a);
        if(a==5){break;
                }
    a++;
    }
    }
}
