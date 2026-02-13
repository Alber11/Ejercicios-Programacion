package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Arrays;

public class Ejercicio27 {
    public static void main(String[] args) {
       int matriz[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = 10*i+j;
            }
        }
        System.out.println(Arrays.deepToString(matriz));
    }
}
