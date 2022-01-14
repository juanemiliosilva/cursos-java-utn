
package ejercicioscondicionales;

import java.util.Scanner;


public class E10 {
    public static void main(String[] args) {
        float n1, n2;
        System.out.println("Ingrese el primer numero");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = sc.nextInt();
        if (n1 == 0 || n2 == 0){
            System.out.println("El dividendo o divisor no puede ser 0");
        }else{
            System.out.println(n1 + "/" + n2 + "=" + n1/n2);   
        }
    }
}
