package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

//Diseñar un programa que solicite usuario que introduzca por teclado 5 números
//decimales (double). A continuación, mostrar los números en el mismo orden que se han introducido.

public class Ejercicio10 {
    public static void main(String[] args) {
        double [] tabla = new double[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Introduzca valor de la tabala " + i + ":");
            tabla[i] = sc.nextDouble();
        }
        System.out.println("Tabla resultante: " + Arrays.toString(tabla));
    }
}
