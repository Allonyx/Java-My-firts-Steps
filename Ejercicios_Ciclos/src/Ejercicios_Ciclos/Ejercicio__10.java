/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//10.-Introducir n numeros por teclado. Que nos diga si es par o impar.
package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio__10 {

    int num;

    Scanner scan10;

    Ejercicio__10() {

        num = 0;

        scan10 = new Scanner(System.in);

    }

    public static void main(String[] args) {
        Ejercicio__10 e10 = new Ejercicio__10();

        while (true) {

            System.out.println("Ingrese un numero para determinar si es PAR o INPAR \n Para finalizar digite (0): ");
            e10.num = e10.scan10.nextInt();

            if (e10.num == 0) {
                System.out.println("El numero que usted ingreso es: " + e10.num);
                break;

            } else if (e10.num % 2 == 0) {
                System.out.println("El numero que usted ingreso es PAR: " + e10.num);

            } else {
                System.out.println("El numero que usted ingreso es INPAR: " + e10.num);

            }

        }

    }
}
