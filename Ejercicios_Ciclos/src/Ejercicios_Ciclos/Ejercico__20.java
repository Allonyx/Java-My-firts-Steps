/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


20.-Calcular el factorial de un numero, mediante subprogramas.
 */
package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercico__20 {

    String res;
    int nn;
    int salida;
    int n;

    Scanner scn20;

    Ejercico__20() {

        res = "s";
        n = 0;
        
        salida = 0;

        scn20 = new Scanner(System.in);

    }

    public static void main(String[] args) {
        Ejercico__20 e20 = new Ejercico__20();
        int factorial;
        
        

        while (e20.res.equals("s")) {
            factorial = 1;
            System.out.println("Ingerese un numero para determniar si tiene factorial: ");
            e20.n = e20.scn20.nextInt();
            e20.nn = e20.n;
            
            if (e20.nn == 0){
                System.out.println("Su factorial es: 1");
                
            }
            
            
            if (e20.n < 0) {
                System.out.println("No tiene factorial.");
            } else;
            {
            }
            while (e20.n > 1) {
                factorial = factorial * e20.n;
                e20.n = e20.n - 1;
            }
            while (true){
                if (e20.n > 0){
                System.out.println("Su factorial es: " + factorial);
                }else;
                {
                    break;
                }
            }
        }
        
    }

}
