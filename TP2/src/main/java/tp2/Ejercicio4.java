
package tp2;


public class Ejercicio4 {
    public static void main(String[] args) {
        int A = 7;
        int B = 8;
        int C = 9;
        int D = 10;
        int Auxiliar = B;
        System.out.println("Valores iniciales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        B = C;
        C = A;
        A = D;
        D = Auxiliar;
        System.out.println("Valores finales:");
        System.out.println("B toma el valor de C -> " + B);
        System.out.println("C toma el valor de A -> " + C);
        System.out.println("A toma el valor de D -> " + A);
        System.out.println("D toma el valor de B -> " + D);
               
    }
}
