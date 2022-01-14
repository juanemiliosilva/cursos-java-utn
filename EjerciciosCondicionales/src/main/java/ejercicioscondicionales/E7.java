/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscondicionales;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author juanc
 */
public class E7 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
       char car1,car2;
       System.out.println("Introduzca el primer caracter");
       car1 = (char)System.in.read();
       System.in.read();
       System.out.println("Introduzca el segundo caracter");
       car2 = (char)System.in.read();
       if (car1 == car2){
           System.out.println("Los caracteres son iguales");
           
       }else        {
           System.out.println("Los caracteres son distintos");
       }
    }
    } 
    
       
       

    

