package com.gmail.albermargar9.Tema6.Actividades;

import java.util.Arrays;

public class Actividad16 {
    public static void main(String[] args) {
        int matrizEjemplo[][] = {{9, 5, 6, 4, 2}, {10, 16, 7, 89, 10},
                {1, 2, 3, 4, 5}, {9, 8, 7, 6, 5}, {10, 11, 12, 13, 14}};
        System.out.println(Arrays.toString(matrizEjemplo));

        matrizEjemplo[0][1] = 0;
        matrizEjemplo[1][4] = 0;
        matrizEjemplo[3][2] = 0;
        matrizEjemplo[4][0] = 0;
        System.out.println(Arrays.deepToString(matrizEjemplo));

        System.out.println("arriba izquierda" + matrizEjemplo[0][0] );
        System.out.println("arriba derecha"+ matrizEjemplo[0][4]);
        System.out.println("abajo izquierda"+ matrizEjemplo[4][0]);
        System.out.println("abajo derecha"+ matrizEjemplo[4][4]);

        int sumaDiagonal = matrizEjemplo[0][0] + matrizEjemplo [1][1]
                + matrizEjemplo[2][2] + matrizEjemplo[3][3] + matrizEjemplo[4][4];
        System.out.println("suma de los elemtos diagonal" + sumaDiagonal);

    }
}
