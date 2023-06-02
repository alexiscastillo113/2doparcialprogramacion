
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleuw
 */
public class LlenarMatriz {
       public static void main(String[] args) {
        int n = 32; 
        int[] matriz = new int[n];
        Random rand = new Random();

        
        for (int i = 0; i < n; i++) {
            matriz[i] = rand.nextInt(100) + 1; 
        }

       
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i] + " ");
        }
    }
 
}
