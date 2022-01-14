/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temaa5;

import java.util.Scanner;

/**
 *
 * @author juanc
 */
public class TEMAa5 {
    public static Scanner sc;
    public static void main(String[] args) {
        {
        sc=new Scanner(System.in);
        int n;
        n=ln();
        nv(n);
        }
    }
    public static int ln(){
        int n=0;
        System.out.println("Indique el valor del numero:");
        n=sc.nextInt();
        return n;
    }
    public static void nv(int n){
        int i;
        for(i=1; i<=n; i++){
            System.out.println(i+" veces ejecutandose:");
        }
    }
}
