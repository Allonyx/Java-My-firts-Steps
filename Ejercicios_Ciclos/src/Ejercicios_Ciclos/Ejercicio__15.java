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
public class Ejercicio__15 {

    int num1;
    int num2;
    int nm1;
    int nm2;
    int aux;
    int con;
    int nim;
    int par;
    int sumimp;

    Scanner scn15;

    Ejercicio__15() {

        num1 = 0;
        num2 = 0;
        nm1 = 0;
        nm2 = 0;
        aux = 0;
        con = 0;
        nim = 0;
        par = 0;
        sumimp = 0;

        scn15 = new Scanner(System.in);

    }

    public static void main(String[] args) {
        Ejercicio__15 e15 = new Ejercicio__15();
        System.out.println("Maquina que impreime los numeros naturales que hay entre\nel primer numero que ingrese y el segunado");
        System.out.println("Ingrese el primer numero:");
        e15.num1 = e15.scn15.nextInt();
        e15.nm1 = e15.num1;
        System.out.println("Ingrese el segundo numero:");
        e15.num2 = e15.scn15.nextInt();
        e15.nm2 = e15.num2;
        if (e15.num1 > e15.num2) {
            e15.aux = e15.num1;
            e15.num1 = e15.num2;
            e15.num2 = e15.aux;
        } else;
        {
        }

        while (e15.num1 < e15.num2) {
            System.out.println(e15.num1);
            e15.con = e15.con + 1;
            if (e15.num1 % 2 == 0) {
                e15.par = e15.par + 1;

            } else;
            {
                if (e15.num1 % 2 == 1) {

                    e15.sumimp = e15.sumimp + e15.nim;
                }
                e15.num1 = e15.num1 + 1;
                e15.nim = e15.num1;
            }

        }
        System.out.println(e15.nm2); 
        System.out.println("la cantidad total de numeros naturales que hay entre " + e15.nm1 + " y " + e15.nm2 + " son: " + (e15.con - 1));
        System.out.println("La cantididad de pares que hay es: " + e15.par );
        System.out.println("La suma de los impares es: " + e15.sumimp );

    }
}
