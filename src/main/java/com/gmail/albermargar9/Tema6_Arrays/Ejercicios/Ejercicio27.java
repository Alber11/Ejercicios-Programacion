package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Arrays;

//Crea un matriz de longitud 5x5.
//Rellena la matriz de la siguiente forma: el elemento de la posición [i][j] debe ser
//igual al valor 10 x i + j.
//Después, muestra el contenido de la matriz

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
