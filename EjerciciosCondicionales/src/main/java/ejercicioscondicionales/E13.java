
package ejercicioscondicionales;

import java.util.Scanner;


public class E13 {
    public static void main(String[] args) {
        int mes;
        System.out.println("Ingrese numero de mes:");
        Scanner sc = new Scanner(System.in);
        mes = sc.nextInt();
        if (mes >=1 && mes<=12){
            if (mes==2){
                System.out.println("El mes "+ mes + " es un mes de 28 dias" );
            }else if (mes == 4 || mes==6 || mes==9 || mes==11){
                System.out.println("El mes " + mes + " es un mes de 30 dias");
            }else{
                System.out.println("El mes " + mes + " es un mes de 31 dias");
            }
        }else{
            System.out.println("Ingrese un numero de mes valido");
        }

    }
    
}
