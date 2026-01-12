package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

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
