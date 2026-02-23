package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

//• Crea una matriz [3][4]. Recorre las casillas para poder rellenar la
//matriz utilizando bucles for anidados. Solicita al usuario los valores
//para rellenar la matriz
//• Crea otra matriz, pero, esta vez, solicita las dimensiones (filas y
//columnas). Recorre las casillas para poder rellenar la matriz
//utilizando bucles for anidados. Solicita los valores al usuario.

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrizUno[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("introduce un elemto en la posicion" + i + j + ":");
                matrizUno[i][j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(matrizUno));

        System.out.println("inreoduce la cantidad de filas de ña segunda matriz");
        int numFilas = sc.nextInt();
        System.out.println("introduce la cantidad de columnas de la segunda matriz");
        int numColumnas = sc.nextInt();

        int matrizDos[][] = new int[numFilas][numColumnas];
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                System.out.println("introduce el elemntso de la posicion" + numFilas + numColumnas + ": ");
                matrizDos[numFilas][numColumnas] = sc.nextInt();
            }

        }
        System.out.println(Arrays.deepToString(matrizDos));
    }
}
