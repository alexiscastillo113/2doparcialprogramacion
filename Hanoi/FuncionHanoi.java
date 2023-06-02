/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hanoi;

import java.util.Scanner;

/**
 *
 * @author aleuw
 */
public class FuncionHanoi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Numero de discos: ");
        n = sc.nextInt();
        Hanoi(n,1,2,3);                                                         
    }

    public static void Hanoi(int n, int origen,  int auxiliar, int destino){
        
        if(n==1){
           System.out.println("mover disco de " + origen + " a " + destino);
           
        }else{
           Hanoi(n-1, origen, destino, auxiliar);
           System.out.println("mover disco de "+ origen + " a " + destino);
           Hanoi(n-1, auxiliar, origen, destino);      
        }
    }
}



