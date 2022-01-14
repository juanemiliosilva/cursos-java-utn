/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;


public class E5 {public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int[]nros=new int[10];
            double sumapos=0, sumaneg=0;
            int pos=0,neg=0;
            int i;
            for(i=0;i<nros.length;i++){
                System.out.println("Ingrese los numeros:");
                nros[i]=sc.nextInt();
            }
            for(i=0;i<nros.length;i++){
                if(nros[i]>0){
                    sumapos=sumapos+nros[i];
                    pos++;
                }else if(nros[i]<0){
                    sumaneg=sumaneg+nros[i];
                    neg++;
                }        
            }
            System.out.println("La media de los numeros positivos es: "+sumapos/pos);
            System.out.println("La media de los numeros negativos es: "+sumaneg/neg);
    }  
}
