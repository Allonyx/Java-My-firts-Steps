/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

19.-Hacer un pseudocodigo que simule el funcionamiento de un reloj digital y
que permita ponerlo en hora.

 */
package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio__19 {

    int h;
    int m;
    int s;
    int c;
    int v_c;
    String res;

    Scanner scn19;

    Ejercicio__19() {

        h = 0;
        m = 0;
        s = 0;
        c = 0;
        v_c = 2;

        scn19 = new Scanner(System.in);

    }

    public static void main(String[] args) {
        Ejercicio__19 e19 = new Ejercicio__19();
        System.out.println("Ingrese la hora:");
        e19.h = e19.scn19.nextInt();
        System.out.println("Ingrese los minutos:");
        e19.m = e19.scn19.nextInt();
        System.out.println("Ingrese los segundos:");
        e19.s = e19.scn19.nextInt();

        while (e19.c <= e19.v_c) {
            e19.c = e19.c +1;
            while (e19.h < 24) {
                while (e19.m < 60) {
                    while (e19.s < 60) {
                        System.out.println( e19.h + ":" + e19.m +":" + e19.s);
                        e19.s = e19.s + 1;
                    }
                    e19.m = e19.m + 1;
                    e19.s = 0;
                }
                e19.h = e19.h + 1;
                e19.m = 0;
            }
            e19.c = e19.c +1;
            e19.h = 1;
            
        }
        
    }

}
