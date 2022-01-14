/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;


class E4 {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos=0, neg=0, cero=0;
        int[]nros=new int[10];
        int i;
        for(i=0;i<nros.length;i++){
            System.out.println("Introduzca los numeros:");
            nros[i]=sc.nextInt();
        }
        for(i=0;i<nros.length;i++){
            if (nros[i]>0){
                pos++;
            }else if(nros[i]<0){
                neg++;
            }else{
                cero++;
            }
        }
        System.out.println("Cantidad de numeros posivos: "+pos);
        System.out.println("Cantidad de numeros negativos: "+neg);
        System.out.println("Cantidad de ceros: "+cero);
    }
    
}
