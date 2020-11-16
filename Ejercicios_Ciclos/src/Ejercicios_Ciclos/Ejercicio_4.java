/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//4.-Hacer un programa que imprima la suma de los 100 primeros numeros.
package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio_4 {

    int cont;
    int v_ctl;
    int acum;

    Scanner scan4;

    Ejercicio_4() {

        cont = 1;
        v_ctl = 100;
        acum = 0;

        scan4 = new Scanner(System.in);

    }

    public static void main(String[] args) {
        Ejercicio_4 ex4 = new Ejercicio_4();

        while (ex4.cont <= ex4.v_ctl) {
            System.out.println(ex4.cont);
            ex4.acum = ex4.acum + ex4.cont;
            ex4.cont = ex4.cont + 1;
        }
        System.out.println(" La suma de los primero 100 numeros es: " + ex4.acum);

    }

}

