/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroautomatic0;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CajeroAutomatic0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accion = 0, deposito, retirar;
        String[] acc = new String[1];
        List<String> acciones = new ArrayList<>(Arrays.asList(acc));
        acciones.clear();
        int saldo = 10000;
        String usutrue = "juanemilio123";
        String pswtrue = "123456";
        String usufalse;
        String pswfalse;
        System.out.println("Ingrese su usuario.");
        usufalse = sc.nextLine();
        if (usufalse.equals("0")) {
            System.out.println("==================================");
            System.out.println("Gracias por usar nuestro sistema.");
            System.out.println("==================================");
            System.exit(0);
        }
        System.out.println("Ingrese su contraseña.");
        pswfalse = sc.nextLine();

        do {
            if (usutrue.equals(usufalse) && pswtrue.equals(pswfalse)) {
                if (accion == 0) {
                    System.out.println("Ingresando al sistema...");
                    System.out.println("Hola Juan Emilio.");
                }
                System.out.println("Ingrese que clase de operacion desea realizar.");
                System.out.println("1.Depositar.");
                System.out.println("2.Sacar plata.");
                System.out.println("3.Mostrar saldo.");
                System.out.println("4.Acciones realizadas.");
                System.out.println("5.Salir.");
                accion = sc.nextInt();
                if (accion > 0 && accion < 6) {
                    switch (accion) {
                        case 1:
                            System.out.println("Selecciono depositar.");
                            System.out.println("Ingrese el saldo a depositar.");
                            deposito = sc.nextInt();
                            if (deposito <= 0) {
                                while (deposito <= 0) {
                                    System.out.println("Ingrese un monto valido.");
                                    deposito = sc.nextInt();
                                }
                                saldo = saldo + deposito;
                                System.out.println("Se ha ingresado el saldo correctamente.");
                                System.out.println("==================================");
                            } else {
                                saldo = saldo + deposito;
                                System.out.println("Se ha ingresado el saldo correctamente.");
                                System.out.println("==================================");
                            }
                            acciones.add("depositar");
                            break;
                        case 2:
                            System.out.println("Selecciono sacar plata.");
                            System.out.println("Ingrese el monto a retirar.");
                            retirar = sc.nextInt();
                            if (retirar <= 0) {
                                while (retirar <= 0) {
                                    System.out.println("Ingrese un monto valido.");
                                    retirar = sc.nextInt();
                                }
                                saldo = saldo - retirar;
                                System.out.println("Operacion realizada satisfactoriamente.");
                                System.out.println("==================================");
                            } else {
                                while (retirar > saldo) {
                                    System.out.println("Ingrese un monto menor a " + saldo);
                                    retirar = sc.nextInt();
                                }
                                saldo = saldo - retirar;
                                System.out.println("Operacion realizada satisfactoriamente.");
                                System.out.println("==================================");
                            }
                            acciones.add("Sacar plata");
                            break;
                        case 3:
                            System.out.println("Selecciono mostrar saldo.");
                            System.out.println("Su saldo es de: " + saldo);
                            acciones.add("Mostrar saldo");
                            System.out.println("==================================");
                            break;

                        case 4:
                            System.out.println("Acciones realizadas: " + acciones);
                            System.out.println("==================================");
                            break;
                        case 5:
                            System.out.println("==================================");
                            System.out.println("Gracias por usar nuestro sistema.");
                            System.out.println("==================================");
                            System.exit(0);
                    }
                } else {
                    System.out.println("Ingrese un termino valido.");
                    System.out.println("==================================");
                }
            } else {
                System.out.println("Usuario o contraseña incorrecto.");
                System.out.println("Ingrese los datos de nuevo.");
                System.out.println("Ingrese su usuario.");
                usufalse = sc.nextLine();
                if (usufalse.equals(0)) {
                    System.out.println("==================================");
                    System.out.println("Gracias por usar nuestro sistema.");
                    System.out.println("==================================");
                    System.exit(0);
                }
                System.out.println("Ingrese su contraseña.");
                pswfalse = sc.nextLine();
            }
        } while (!usufalse.equals(0) || accion > 5);

    }
}
