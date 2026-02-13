package com.gmail.albermargar9.Tema6.Actividades;

import java.util.Arrays;

public class Actividad17 {
    public static void main(String[] args) {
        int matrizUno [][]={{1, 3, 5, 7, 9}, {11, 13, 15, 17, 19}, {1, 3, 5, 7, 9}};
        int matrizDos [][]= new int[3][3];

        matrizDos[0][0] = 99;
        matrizDos[0][1] = 100;
        matrizDos[0][2] = 101;

        matrizDos[1][0] = 102;
        matrizDos[1][1] = 103;
        matrizDos[1][2] =104;

        matrizDos[2][0] = 105;
        matrizDos[2][1] = 106;
        matrizDos[2][2] = 107;

        System.out.println("matriz 1" + matrizUno);
        System.out.println(Arrays.deepToString(matrizUno));

        System.out.println("matriz 2" + matrizDos);
        System.out.println(Arrays.deepToString(matrizDos));

    }
}
