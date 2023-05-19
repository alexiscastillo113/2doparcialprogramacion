/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aleuw
 */
public class ListaNombres {
   

    private static List<String> nombres = new ArrayList<>();

    public static void main(String[] args) {
        // Agregar nombres a la lista
        agregarNombre("Alexis Castillo");
        agregarNombre("Maria Teresa Martinez");
        agregarNombre("Jair Castillo");

        
        imprimirNombres();
    }

    public static void agregarNombre(String nombre) {
        nombres.add(nombre);
    }

    public static void imprimirNombres() {
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}


