/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//11.-Imprimir y contar los multiplos de 3 desde la unidad hasta un numero que introducimos por teclado.

package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio__11 {
    
    int num;
    int c;
    int t;
    
    Scanner scan11;
    
    Ejercicio__11 () {
        
        num = 0;
        c = 0;
        t = 0;
        
        scan11 = new Scanner(System.in);
        
    
    
    }
    public static void main(String[] args) {
        Ejercicio__11 e11 = new Ejercicio__11();
        System.out.println(" Ingrese un numero: ");
        e11.num = e11.scan11.nextInt();
        
        
        while(e11.c < e11.num) {
            System.out.println(e11.c);
            e11.t = e11.t + 1;
            e11.c = e11.t * 3;
        }
        System.out.println("La cantidad total de multiplos de tres que hay \nasta el numero que usted ingreso es: " + e11.t );
        System.out.println("El numero qu eusted ingreso es: " + e11.num);
    }
    
}
