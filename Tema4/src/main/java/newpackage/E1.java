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
public class E1 {
    public static void main(String[] args) {
        int[]nros=new int[10];
        Scanner sc = new Scanner(System.in);
        int i;
        int nro1=0;
        int nro2=0;
        int sumapos=0;
        int sumaneg=0;
        for(i=0; i<10;i++){
            System.out.println("Ingrese los numeros que quiere promediar: ");
            nros[i]=sc.nextInt();
        }
        for(i=0;i<10;i++){
            if(nros[i]>0){
            sumapos=sumapos+nros[i];
            nro1++;
            }else{
            sumaneg=sumaneg+nros[i];
            nro2++;
            }
        }   
        if (nro1!= 0){ 
            System.out.println("La media de los valores positivos es: " + sumapos/nro1);   
        }else{
            System.out.println("No hay numeros positivos");
        } 
        if(nro2!=0){
            System.out.println("La Media de los valores negativos es: " + sumaneg/nro2);   
        }else{
            System.out.println("No hay numeros negativos");
        }
    }
}
