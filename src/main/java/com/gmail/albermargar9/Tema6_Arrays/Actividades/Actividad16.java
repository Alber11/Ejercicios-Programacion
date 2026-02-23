package com.gmail.albermargar9.Tema6_Arrays.Actividades;

import java.util.Arrays;

//1. Indica cuál es la posición dentro de la matriz de los elementos rodeados (qué habría que poner para acceder)
//2. Asigna a todos los elementos rodeados, en código, manualmente, el valor 0. Imprime después la matriz.
//3. Imprime los elementos que están en las cuatro esquinas de la matriz por pantalla.
//4. Suma los elementos de la diagonal accediendo a cada uno de ellos.

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
