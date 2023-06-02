/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ackerman;

import java.util.Scanner;

/**
 *
 * @author aleuw
 */
public class Funcion_Ackerman {
    static Scanner leer = new Scanner(System.in);
    
    static int Ackerman (int m, int n){
        if( m == 0)
            return n+1;
        else if (n == 0)
            return Ackerman(m-1,1);
        else 
            return Ackerman(m-1, Ackerman(m, n-1));
    }
    
    public static void main(String[] args) {
        
        int m;
        int n;
         
        System.out.println("Ingrese el Primer valor");
        m = leer.nextInt();
        System.out.println("Ingrese el Segundo valor");
        n = leer.nextInt();
        System.out.println("El valor de Ackerman es: " + Ackerman(m, n));
    }
}


