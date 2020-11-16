/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//9.-Introducir un numero por teclado. Que nos diga si es positivo o negativo.
package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio_9 {

    float num;

    Scanner scan9;

    Ejercicio_9() {

        num = 0;

        scan9 = new Scanner(System.in);

    }

    public static void main(String[] args) {
        Ejercicio_9 ex9 = new Ejercicio_9();

        while (true) {

            System.out.println("Ingrese un nuemro: ");
            ex9.num = ex9.scan9.nextFloat();

            if (ex9.num > 0) {
                System.out.println("El numero que usted ingreso es positivo: " + ex9.num);

            } else if (ex9.num < 0) {
                System.out.println("El numero que usted ingreso es negativo: " + ex9.num);

            } else {
                break;
            }
        }
    }

}
