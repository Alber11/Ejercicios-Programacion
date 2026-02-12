package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Arrays;

public class Ejercicio18 {
    public static int buscar(int tabla[], int clave){
        int posicion;
        int i = 0;

        while (i < tabla.length && tabla[i] != clave){
            i++;
        }

        if (i< tabla.length){
            posicion = i;
        }else{
            posicion = -1;
        }

        return posicion;
    }

    public static int[] sinRepetidos (int[] tabla) {
        int sinRepetidos[] = new int[0];

        for (int elemento : tabla){
            if(buscar(sinRepetidos, elemento)==-1){
                sinRepetidos = Arrays.copyOf(sinRepetidos, sinRepetidos.length+1);
                sinRepetidos[sinRepetidos.length-1] = elemento;
            }
        }
        return sinRepetidos;
    }

    public static void main(String[] args) {
        int conRepetidos [] = {1, 7, 2, 3, 2, 7, 0, 7, 1, 3, 4, 2, 3, 5};
        int sinRepetidos [] = sinRepetidos(conRepetidos);

        System.out.println("con repetidos" + Arrays.toString(conRepetidos));
        System.out.println("sin repetidos" + Arrays.toString(sinRepetidos));
    }
}
