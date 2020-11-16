/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//18.-Hacer un pseudocodigo que cuente las veces que aparece una determinada
//letra en una frase que introduciremos por teclado.
package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio__18 {

   

    String frase;
    String letra;
    char [] lc;
    String res;
    int lon;
    int c;

    Scanner scn18;

    Ejercicio__18() {

        frase = "";
        letra = "";
        res = "s";
        lon = 0;
        c = 0;

        scn18 = new Scanner(System.in);

    }

    public static void main(String[] args) {
        Ejercicio__18 e18 = new Ejercicio__18();
        
        

        while (e18.res.equals("s")) {
            System.out.println("Introduce una Frase: ");
            e18.frase = e18.scn18.nextLine();
            e18.lc = e18.frase.toCharArray();
            e18.lon = e18.frase.length();
              
            int i = 1;
            System.out.println("Que letra desea Buscar: " + e18.lon);
            e18.letra = e18.scn18.next();

            while (i <= e18.lon) {
                if (e18.letra.equals(e18.letra)) {
                    e18.c = e18.c + 1;

                }
                i = i + 1;
            }
            System.out.println("El numero de veces que aprece la letra:  " + e18.letra + "\nen la frase:  " + e18.frase + "\nes de: " + e18.c);
            e18.res = " ";
            while (!e18.res.equals("s") && !e18.res.equals("n")) {
                System.out.println("Desea volver a ejecutar la maquina otra vez? \nreponda s para SI o n para NO: ");
                e18.res = e18.scn18.next();

            }

        }

    }
}


