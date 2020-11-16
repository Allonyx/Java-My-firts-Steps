/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// 16.-Imprimir diez veces la serie de numeros del 1 al 10.
package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio__16 {

    int serie;
    int c;

    Scanner scn16;

    Ejercicio__16() {

        serie = 0;
        c = 0;

        scn16 = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Ejercicio__16 e16 = new Ejercicio__16();

        while (e16.serie <= 10) {
            e16.c = 1;
            while (e16.c <= 10) {
                System.out.println(e16.c);
                e16.c = e16.c + 1;
            }

            e16.serie = e16.serie + 1;
        }

    }

}
