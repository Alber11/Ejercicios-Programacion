package com.gmail.albermargar9.Tema6.Actividades;

import java.util.Arrays;

public class Actividad18 {
    public static void main(String[] args) {
        int matrizEjemplo[][] = { { 9, 5, 6, 4, 2 },
                { 10, 16, 7, 89, 10 },
                { 1, 2, 3, 4, 5 },
                { 9, 8, 7, 6, 5 },
                { 10, 11, 12, 13, 14} };

        for (int i = 0; i < matrizEjemplo.length; i++) {
            System.out.println("referncia fila" + i + ":" + matrizEjemplo[i]);
            System.out.println("fila" + i + ":" + Arrays.toString(matrizEjemplo[i]));
        }

    }
}
