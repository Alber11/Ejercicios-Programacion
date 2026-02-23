package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Arrays;

//Definir una función
//public static int primitiva(int apuesta[ ], int cambinacionGanadora[ ])
//que toma como parámetros dos tablas, la primera con los seis números de la apuesta de la primitiva, y la segunda (ordenada) con los 6 números de la combinación
//ganadora. La función devolverá el número de aciertos.

public class Ejercicio15 {
    static int primitiva (int apuesta[], int[] combinacionGanadora){
        int aciertos = 0;

        for (int a : apuesta) {
            if (Arrays.binarySearch(combinacionGanadora, a) >= 0){
                aciertos ++;
            }
        }
        return aciertos;
    }

    public static void main(String[] args) {
        int combinacionGanadora[] = {3, 13, 25, 33, 41, 48};
        int apuesta[] = {3, 25, 41, 42, 45, 49};

        System.out.println("Aciertos" + primitiva(combinacionGanadora, apuesta));
    }
}
