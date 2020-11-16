/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//14.-Hacer un pseudocodigo que imprima el mayor y el menor de una serie de
//cinco numeros que vamos introduciendo por teclado.
package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio__14 {
    
    int c;
    int num;
    int max;
    int min;

    Scanner scan14;

    Ejercicio__14() {

        c = 0;
        num = 0;
        max = 0;
        min = 999999;
        scan14 = new Scanner(System.in);

    }

    public static void main(String[] args) {
        Ejercicio__14 e14 = new Ejercicio__14();
        System.out.println("Maquina que recibe 5 numeros y muestra el menor y el mayor. ");

        while (e14.c < 5) {
            System.out.println("Ingrese un numero: ");
            e14.num = e14.scan14.nextInt();
            if (e14.num > e14.max) {
                e14.max = e14.num;
            } else;
            {
            }
            if (e14.num < e14.min) {
                e14.min = e14.num;
            } else;
            {
            }
            e14.c = e14.c + 1;

        }
        System.out.println("El numero mayor es: " + e14.max);
        System.out.println("El numero men es: " + e14.min);

    }
}
