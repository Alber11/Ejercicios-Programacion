package com.gmail.albermargar9.Tema5;

import java.util.Scanner;

public class Ejercicio5 {
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
