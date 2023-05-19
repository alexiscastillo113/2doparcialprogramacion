/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleuw
 */
public class ImprimirAlfabeto {
   
    public static void main(String[] args) {
        imprimirAlfabetoAlternado();
    }

    public static void imprimirAlfabetoAlternado() {
        char letra = 'A';

        for (int i = 0; i < 26; i++) {
            if (i % 2 == 0) {
                System.out.print(Character.toUpperCase(letra) + " ");
            } else {
                System.out.print(Character.toLowerCase(letra) + " ");
            }

            letra++;
        }

        System.out.println();
    }
}


