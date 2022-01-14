
package ejercicioscondicionales;

import java.util.Scanner;


public class E11 {
    public static void main(String[] args) {
        int n1, n2, n3;
        System.out.println("Ingrese el primer numero");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        n3 = sc.nextInt();
        if (n1>n2){
            if (n1>n3){
                System.out.println("El numero mas grande es el primero: " + n1);
            }else {
                System.out.println("El numero mas grande es el tercero: " + n3);
            }
        }else if (n2>n3){ 
            System.out.println("El numero mas grande es el segundo: " + n2);
        }else {
            System.out.println("El numero mas grande es el tercero: " + n3);
        }
    }
 
}
