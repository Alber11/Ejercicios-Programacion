package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Arrays;

public class Ejercicio12 {
    public static int[] rellenaPares(int longitud, int fin){
        int [] tablaPares = new int[longitud];
        int i = 0;
        while (i< tablaPares.length){
            //dentro de un while para que no supere la longitud especificada
            int numero = (int) (Math.random()*fin+1);
            if (numero%2==0){
                tablaPares[i] = numero;
                i++;
            }//bucle if con condicion para solo rellenar la tabla de pares
        }
        Arrays.sort(tablaPares);
        return tablaPares;
    }

    public static void main(String[] args) {
        int [] tablaPares = rellenaPares(10, 100);
        System.out.println(Arrays.toString(tablaPares));
    }
}
