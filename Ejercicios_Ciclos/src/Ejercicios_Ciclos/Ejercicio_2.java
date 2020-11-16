/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// 2.-Hacer un pseudocodigo que imprima los numeros del 100 al 0, en orden decreciente

package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio_2 {
    
    int conteo;
    int variable_control;
    Scanner scan2;
    
    Ejercicio_2 () {
        
        conteo = 100;
        variable_control = 0;
        
        scan2 = new Scanner(System.in);
    
    }
    public static void main(String[] args) {
        Ejercicio_2 ex2 = new Ejercicio_2();
        
        while (ex2.conteo >= ex2.variable_control) {
             System.out.println(ex2.conteo);
             ex2.conteo = ex2.conteo - 1;
        }
    }
    
}
