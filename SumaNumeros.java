

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */







public class SumaNumeros {
    public static void main(String[] args) {
        int contadorPares = 0;
        int contadorImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        int numero = 1;

        while (contadorPares < 3 || contadorImpares < 3) {
            if (numero % 2 == 0 && contadorPares < 3) {
                sumaPares += numero;
                contadorPares++;
            } else if (numero % 2 != 0 && contadorImpares < 3) {
                sumaImpares += numero;
                contadorImpares++;
            }
            numero++;
        }

        System.out.println("La suma de los tres primeros numeros pares es: " + sumaPares);
        System.out.println("La suma de los tres primeros numeros impares es: " + sumaImpares);
    }
}

