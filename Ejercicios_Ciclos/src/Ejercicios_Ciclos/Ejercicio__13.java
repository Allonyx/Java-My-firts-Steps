/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio__13 {

    int num;
    int v_c;
    int c2;
    int t2;

    Scanner scan13;

    Ejercicio__13() {

        v_c = 100;
        c2 = 0;
        t2 = 0;
        num = 0;

        scan13 = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Ejercicio__13 e13 = new Ejercicio__13();
        System.out.println("Programa que imprime y cuenta los multiplos de 2 o 3 asta 100\nIngrese un numero (2/3): ");
        e13.num = e13.scan13.nextInt();
        if (e13.num == 2 || e13.num == 3) {
            

            while (e13.c2 < e13.v_c) {
                System.out.println(e13.c2);
                e13.t2 = e13.t2 + 1;
                e13.c2 = e13.c2 + e13.num;

            }
            System.out.println("La cantidad total de multiplos de " + e13.num + " que hay hasta 100 es: " + e13.t2);
        }else;
        {
        }
    }

}
