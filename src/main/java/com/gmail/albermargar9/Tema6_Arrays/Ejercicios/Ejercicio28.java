package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Arrays;

//Crea la función
//public static int maximoMatriz(int matriz[][])
//que recibe una matriz, la recorre, y devuelve el valor del mayor elemento que ha
//encontrado.
//Utiliza un for normal.

public class Ejercicio28 {
    public static int maximoMatriz(int matriz[][]){
        int maximo = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]>maximo){
                    maximo= matriz[i][j];
                }
            }
        }
        return maximo;
    }
    public static void main(String[] args) {
        int matriz[][] = {{1,7,8}, {9,8,3}, {0,-5,-10}};
        System.out.println(Arrays.deepToString(matriz));
        int maximo = maximoMatriz(matriz);
        System.out.println("maximo" + maximo);
    }
}
