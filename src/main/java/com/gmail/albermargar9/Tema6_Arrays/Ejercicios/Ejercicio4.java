package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Arrays;

//Crea una tabla de longitud 20 que si inicializará con número pares del 2 al 40:
//        2, 4, 6, 8, 10, 12, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38

public class Ejercicio4 {
    public static void main(String[] args) {
        int [] tabla = new int[20];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i]= i*2+2;
        }
        //en este caso estamos recoriendola con numero pares multiplicando por 2 + 2
        System.out.println(Arrays.toString(tabla));
    }
}
