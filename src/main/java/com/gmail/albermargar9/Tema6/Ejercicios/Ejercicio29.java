package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Arrays;

public class Ejercicio29 {
    public static int suma(int matriz[][]){
        int suma = 0;
        for (int fila[]:matriz){
            for (int elemnto:fila){
                suma+=elemnto;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int matriz [][] = {{1,7,8}, {9,8,3}, {0,-5,-10}};
        System.out.println(Arrays.deepToString(matriz));
        int suma = suma(matriz);
        System.out.println("suma:" + suma);
    }
}
