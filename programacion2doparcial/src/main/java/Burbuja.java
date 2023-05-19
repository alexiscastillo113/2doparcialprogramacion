/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleuw
 */
public class Burbuja {
    
    public static void main(String[] args) {
        int[] matriz = {5, 3, 8, 2, 14,1,10,21}; 

        System.out.println("Matriz antes de la ordenacion:");
        imprimirMatriz(matriz);

        burbuja(matriz);

        System.out.println("Matriz despues de la ordenacion:");
        imprimirMatriz(matriz);
    }

    public static void burbuja(int[] matriz) {
        int n = matriz.length;
        boolean intercambio;

        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (matriz[j] > matriz[j + 1]) {
                    int temp = matriz[j];
                    matriz[j] = matriz[j + 1];
                    matriz[j + 1] = temp;
                    intercambio = true;
                }
            }

           
            if (!intercambio) {
                break;
            }
        }
    }

    public static void imprimirMatriz(int[] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i] + " ");
        }
        System.out.println();
    }
}
