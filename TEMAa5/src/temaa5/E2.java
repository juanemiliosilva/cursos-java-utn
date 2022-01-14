package temaa5;

import java.util.Scanner;

public class E2 {

    public static final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        int nro1, nro2, opsuma, opresta, opmult;
        float opdivi;
        nro1 = leerNumero("Leer Numero 1");
        nro2 = leerNumero("Leer Numero 2");
        //opsuma = suma(nro1, nro2);
        suma(nro1,nro2);
       // opresta = resta(nro1, nro2);
        //opmult = mult(nro1, nro2);
        //opdivi = divi(nro1, nro2);
        //resultados(opsuma, opresta, opmult, opdivi);
    }

    public static int leerNumero(String leer_numero) {
        int n;
        System.out.println("Indique el " + leer_numero);
        n = sc.nextInt();
        return n;
    }

    public static void suma(int n1, int n2) 
    {        
        //return n1 + n2;
        System.out.println(n1+n2);
    }
    

}
