/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//5.-Hacer un pseudocódigo que imprima los numeros impares hasta el 100 y que imprima cuantos impares hay.

package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio_5 {

    int cont;
    int v_ctl;
    int total;

    Scanner scan5;

    Ejercicio_5() {

        cont = 1;
        v_ctl = 100;
        total = 0;

        scan5 = new Scanner(System.in);

    }

    public static void main(String[] args) {
        Ejercicio_5 ex5 = new Ejercicio_5();

        while (ex5.cont <= ex5.v_ctl) {
            System.out.println(ex5.cont);
            ex5.cont = ex5.cont + 2;
            ex5.total = ex5.total + 1;
            
        }
        System.out.println(" El total de numeros impares que hay asta 100 es: " + ex5.total);
    }
}          