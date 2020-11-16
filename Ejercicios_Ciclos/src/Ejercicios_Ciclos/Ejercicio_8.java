/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Ciclos;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio_8 {
    char res1;
    
    
    Scanner scan8;
    
    Ejercicio_8(){
       
        res1 = ' ';
        
        
        scan8 = new Scanner(System.in);
    
    }
    public static void main(String[] args) throws IOException {
        Ejercicio_8 ex8 = new Ejercicio_8();
        
        while (ex8.res1 != 's' && ex8.res1 != 'n'){
            System.out.println("Ingrese S o N:");
            ex8.res1 = (char)System.in.read();
        }
    }
    
    
 
}
