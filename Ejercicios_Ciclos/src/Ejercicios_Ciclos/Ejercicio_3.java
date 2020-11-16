/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//3.-Hacer un pseudocodigo que imprima los numeros pares entre 0 y 100.


package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio_3 {
    
    int conteo;
    int v_cnt;
    
    Scanner scan3;
    
    Ejercicio_3 (){
        
        conteo = 0;
        v_cnt = 100;
        
        scan3 = new Scanner(System.in);
        
    
    }
    public static void main(String[] args) {
        Ejercicio_3 ex3 = new Ejercicio_3();
        
        while (ex3.conteo <= ex3.v_cnt) {
            System.out.println(ex3.conteo);
            ex3.conteo = ex3.conteo +2;
        }
    }
    
    
}
