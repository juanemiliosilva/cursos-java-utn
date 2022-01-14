/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscondicionales;

import java.io.IOException;

/**
 *
 * @author juanc
 */
public class E3 {
    public static void main(String[] args) throws IOException {
        char car;
        System.out.println("Ingrese un caracter");
        car = (char)System.in.read();
        if (Character.isUpperCase(car)){
            System.out.println("su caracter esta en mayusculas");
            
        }else{
            System.out.println("Su caracte no esta en mayusculas");
        }
    }
}
