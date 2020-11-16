
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*12.-Hacer un pseudocodigo que imprima los numeros del 1 al 100. Que calcule la
suma de todos los numeros pares por un lado, y por otro, la de todos los
impares.

package Ejercicios_Ciclos;

/**
 *
 * @author aleja
 */
public class Ejercicio__12 {

    int c1;
    int c2;
    int c3;
    int v_c;
    int t1;
    int t2;

    Scanner scan12;

    Ejercicio__12() {

        c1 = 0;
        c2 = 1;
        c3 = 0;
        v_c = 100;
        t1 = 0;
        t1 = 0;

        scan12 = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Ejercicio__12 e12 = new Ejercicio__12();

        while (e12.c3 < e12.v_c) {

            e12.c3 = e12.c3 + 1;
            System.out.println(e12.c3);
            e12.c1 = e12.c1 + 2;
            e12.t1 = e12.t1 + e12.c1;
            e12.c2 = e12.c2 + 2;
            e12.t2 = e12.t2 + e12.c2;
        }
        System.out.println("La suma de los PARES asta 100 es: " + e12.t1);
        System.out.println("La suma de los INPARES asta 100 es: " + e12.t2);

    }

}
