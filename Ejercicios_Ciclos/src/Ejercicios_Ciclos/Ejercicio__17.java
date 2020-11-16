/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

//17.-Imprimir, contar y sumar los multiplos de 2 que hay entre una serie de
numeros, tal que el segundo sea mayor o igual que el primero.

 */
package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio__17 {

    int c;
    int n1;
    int nn1;
    int n2;
    int sum;
    String res;

    Scanner scn17;

    Ejercicio__17() {

        c = 0;
        n1 = 0;
        nn1 = 0;
        n2 = -999;
        sum = 0;
        res = "s";
        scn17 = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Ejercicio__17 e17 = new Ejercicio__17();

        System.out.println("Maquina que contara y sumara los multiplos de 2 \n que se ecuentren entre los dos numero que seran ingresados por teclado");
        System.out.println("Ingrese el primer numero: ");
        e17.n1 = e17.scn17.nextInt();
        e17.nn1 = e17.n1;
        System.out.println("Ingrese el segundo numero que sea mayor al primer numero ya ingresado: ");

        while (e17.res.equals("s")) {

            while (e17.n1 >= e17.n2) {
                e17.n2 = e17.scn17.nextInt();
            }
            e17.n1 = e17.n1 + 1;
            while (e17.n1 <= e17.n2 - 1) {

                if (e17.n1 % 2 == 0) {
                    System.out.println(e17.n1);
                    e17.c = e17.c + 1;
                    e17.sum = e17.sum + e17.n1;

                } 
            }
            System.out.println("La cantidad de multiplos de 2 que hay entre " + e17.nn1 + " y " + e17.n2 + " es : " + e17.c);
            System.out.println("La suma de los multiplos de 2 es: " + e17.sum);
            e17.res = "";
            while (!e17.res.equals("s") && !e17.res.equals("n")) {
                System.out.println("Desea volver a ejecutar la maquina otra vez? \nreponda s para SI o n para NO: ");
                e17.res = e17.scn17.next();

            }
        }
    }
}
