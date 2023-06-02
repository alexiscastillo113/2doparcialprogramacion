/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author aleuw
 */
public class BusquedaSecuencial {
   




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener el tamaño del arreglo
        System.out.print("Ingrese la cantidad de calificaciones: ");
        int n = scanner.nextInt();

        // Crear el arreglo para almacenar las calificaciones
        int[] calificaciones = new int[n];

        // Obtener las calificaciones del usuario
        System.out.println("Ingrese las calificaciones:");
        for (int i = 0; i < n; i++) {
            System.out.print("Calificación #" + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
        }

        // Obtener la calificación a buscar
        System.out.print("Ingrese la calificación a buscar: ");
        int calificacionBuscada = scanner.nextInt();

        // Realizar la búsqueda secuencial
        int posicion = -1;
        for (int i = 0; i < n; i++) {
            if (calificaciones[i] == calificacionBuscada) {
                posicion = i;
                break;
            }
        }

        // Imprimir el resultado de la búsqueda
        if (posicion != -1) {
            System.out.println("La calificación " + calificacionBuscada + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("La calificación " + calificacionBuscada + " no se encuentra en el arreglo.");
        }
    }
}


