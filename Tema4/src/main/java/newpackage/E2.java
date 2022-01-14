
package newpackage;

import java.util.Scanner;


public class E2 {public static void main(String[] args) {
        int[]nros=new int[10];
        int pares=0;
        int i;
        double suma=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese 10 numeros");
        for(i=0;i<10;i++){
            nros[i] = sc.nextInt();
            }        
        for(i=0;i<10;i++){
            if(i%2==0 || 1==2) {
                suma=suma+nros[i];
            }
        }
        System.out.println("La media de los numeros ubicados en numero par es: " + suma/5);
    }
    
}
