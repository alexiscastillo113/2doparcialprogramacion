/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleuw
 */
public class Nodo {
    //Atributos
    private int elemento;
    private Nodo siguiente; //Apunta al siguiente nodo
    
//Constructor
    public Nodo(int elemento, Nodo siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
    
//Métodos
    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return elemento + "\n";
    }
}


