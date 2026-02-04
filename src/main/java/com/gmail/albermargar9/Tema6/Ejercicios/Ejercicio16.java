package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16 {
    public static int[] copia(int tabla[]){
        int copia[] = new int[tabla.length];

        for (int i = 0; i < tabla.length; i++) {
            copia[i] = tabla[i];
        }
        return copia;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la longitud de la tabla");
        int longitud = sc.nextInt();

        int tabla[] = new int[longitud];
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("introduce el valor en la posicion" + i + ":");
            tabla[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(tabla));
        System.out.println(tabla);

        int copia[] = copia(tabla);
        System.out.println(Arrays.toString(tabla));
        System.out.println(tabla);
    }
}
