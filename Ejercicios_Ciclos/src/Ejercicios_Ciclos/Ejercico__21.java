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
public class Ejercico__21 {
    
    int par;
    int imp;
    int sw;
    int c;
     
    Scanner scn21;
    
    Ejercico__21 (){
        
        par = 0;
        imp = 0;
        sw = 0;
        c = 1;
        
        scn21 = new Scanner (System.in);
        
    }
    public static void main(String[] args) {
        Ejercico__21 e21 = new Ejercico__21();
        
        while ( e21.c <= 1000){
            
            if ( e21.sw == 0){
                e21.imp = e21.imp + e21.c;
                e21.sw = 1;
            }else;
            {
                e21.par = e21.par + e21.c;
                e21.sw = 0;
            }
            e21.c = e21.c + 1;
        }
        System.out.println("La suma de los pares es: " + (e21.par - 250000));
        System.out.println("La suma de los impares es:" + (e21.imp - 250500));
        
    }
}
