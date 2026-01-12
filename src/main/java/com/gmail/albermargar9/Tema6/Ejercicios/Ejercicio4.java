package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Arrays;

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
