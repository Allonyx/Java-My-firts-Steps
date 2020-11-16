/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//7.-Introducir tantas frases como queramos y contarlas.
package Ejercicios_Ciclos;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio_7 {

    String frase;
    int cont;

    Scanner scan7;

    Ejercicio_7() {

        frase = "";
        cont = 0;

        scan7 = new Scanner(System.in);

    }

    public static void main(String[] args) {
        Ejercicio_7 ex7 = new Ejercicio_7();

        while (true) {

            System.out.println(" Escriba tantas frases como desee, cuando haya terminado solo presione ENTER: ");
            ex7.frase = ex7.scan7.nextLine();
            ex7.cont = ex7.cont + 1;

            if (ex7.frase.equals("")) {
                break;
            }
        }

        System.out.println("La cantidad total de frases que usted ingreso es: " + (ex7.cont - 1));
    }
}
