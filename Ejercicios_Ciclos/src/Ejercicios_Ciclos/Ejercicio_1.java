/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//1.-Hacer un pseudocodigo que imprima los numeros del 1 al 100.
package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio_1 {

    int conteo;
    int variable_control;

    Scanner escn1;

    Ejercicio_1() {
        conteo = 1;
        variable_control = 100;

        escn1 = new Scanner(System.in);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio_1 ex1 = new Ejercicio_1();

        while (ex1.conteo <= ex1.variable_control) {
            System.out.println(ex1.conteo);
            ex1.conteo = ex1.conteo + 1;
        }

        // TODO code application logic here
    }

}
