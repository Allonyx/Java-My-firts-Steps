/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//6.-Hacer un pseudocodigo que imprima todos los numeros naturales que hay
//desde la unidad hasta un numero que introducimos por teclado.

package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio_6 {

    int cont;
    int v_ctl;

    Scanner scan6;

    Ejercicio_6() {

        cont = 0;
        v_ctl = 0;

        scan6 = new Scanner(System.in);

    }

    public static void main(String[] args) {
        Ejercicio_6 ex6 = new Ejercicio_6();
        System.out.println(" Ingrese un numero: ");
        ex6.v_ctl = ex6.scan6.nextInt();
        System.out.println(" Estos son todos loa numeros naturales que hay esta el numero que usted ingreso: " );

        while (ex6.cont < ex6.v_ctl) {
            System.out.println(ex6.cont);
            ex6.cont = ex6.cont + 1; 
         
        }
        System.out.println(" El numero qu eusted ingreso es: " + ex6.v_ctl);
    }
} 
