
package ejercicioscondicionales;

import java.util.Scanner;


public class E5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //medicinas
    int med0= 750;
    int med1= 1000;        
    int med2= 1250;
    int med3= 1500;
    //variables
    int aum;
    int total;
    int edad;
    int grado;
    //Datos
    System.out.println("Ingrese su edad");
    edad = sc.nextInt();
    System.out.println("Ingrese el grado de la enfermedad");
    grado = sc.nextInt();
    //if
    if (edad >=14 && edad <= 22 && grado==0){
        aum = (med0 /100) * 10;
        total = aum + med0;
        System.out.println("El valor total de la medicina es: " + total);
    }else if(grado==0){
        System.out.println("El total de la medecina es: " + med0);
    }
    if (edad>=14 && edad<=22 && grado==1){
        aum = (med1 /100)* 10;
        total = aum + med1;
        System.out.println("El valor total de la medicina es: " + total);
    }else if (grado==1){
        System.out.println("El valor total de la medicina es: " + med1);
    }
    if (edad>=14 && edad<=22 && grado==2){
        aum = (med2 /100)* 10;
        total = aum + med2;
        System.out.println("El valor total de la medicina es: " + total);
    }else if (grado==2){
        System.out.println("El valor total de la medicina es: " + med2);
    }
    if (edad>=14 && edad<=22 && grado==3){
        aum = (med3 /100)* 10;
        total = aum + med3;
        System.out.println("El valor total de la medicina es: " + total);
    }else if (grado==3){ 
        System.out.println("El valor total de la medicina es: " + med3);
    }
    } 
}
