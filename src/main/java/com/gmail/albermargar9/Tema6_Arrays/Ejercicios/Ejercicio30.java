package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

//1. Solicita al usuario las dimensiones de una matriz (al menos tres filas), así como sus valores. Para rellenar la matriz con valores utiliza un bucle for con
//dimensiones genéricas.
//2. Ordena con Arrays.sort() la primera fila de la matriz.
//3. Rellena con Arrays.fill() la segunda fila con el número 17.
//4. Compara si la primera fila es igual a la última con Arrays.equals()

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("numero de filas de la matriz: ");
        int filas = scanner.nextInt();
        while (filas<3){
            System.out.println("Minimo 3");
            filas = scanner.nextInt();
        }

        System.out.println("Numero de columnas de la matriz: ");
        int columnas = scanner.nextInt();
        while (columnas<0){
            System.out.println("introduce valores positivos");
            columnas = scanner.nextInt();
        }

        int matriz[][] = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("posicion" + i + j + ": ");
                matriz[i][j]=scanner.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(matriz));

        Arrays.sort(matriz[0]);
        System.out.println(Arrays.deepToString(matriz));

        Arrays.fill(matriz[1], 0);
        System.out.println(Arrays.deepToString(matriz));

        System.out.println("la primera fila es igual que la ultima: " + Arrays.equals(matriz[0], matriz[matriz.length-1]));

    }
}
