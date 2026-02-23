package com.gmail.albermargar9.Tema5_MetodosFunciones;

import java.util.Scanner;

public class Ejercicio5 {

//    1. Define una función “escribirNumerosComprendido” a la que se le pasen dos
//    enteros y muestre todos los números comprendidos entre ellos.
//    2. Incluye una función main para solicitar los datos al usuario y probar la función.
//    Ejemplos de ejecución:
//    Primer número:3
//    Segundo número:5
//            3 4 5
//    Primer número:-2
//    Segundo número:10
//            -2 -1 0 1 2 3 4 5 6 7 8 9 10

    public static void escribirNumerosComprendido(int numero1, int numero2){
        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);
        for (int i = menor; i <= mayor ; i++) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int numero1 = sc.nextInt();
        System.out.println("Escriba otro numero");
        int numero2 = sc.nextInt();
        escribirNumerosComprendido(numero1, numero2);
    }
}
