package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

//Escribir una función
//public static int[] insertarOrdenado(int tabla[], int nuevo)
//con el comportamiento de la inserción ordenada.

public class Ejercicio21 {
    public static int[] insertarOrdenado(int tabla[], int nuevo){
        int indiceInsercion = Arrays.binarySearch(tabla, nuevo);

        if (indiceInsercion < 0){
            indiceInsercion = -indiceInsercion -1;
        }

        int copia[] = new int[tabla.length+1];
        System.arraycopy(tabla, 0 , copia,0, indiceInsercion);
        System.arraycopy(tabla,  indiceInsercion, copia, indiceInsercion +1 , tabla.length -  indiceInsercion);

        copia[indiceInsercion] = nuevo;

        return copia;
    }

    public static void main(String[] args) {
        int tabla[] = new int[10];

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random()*1000);
        }

        Arrays.sort(tabla);
        System.out.println("datos" + Arrays.toString(tabla));

        System.out.println("que valor desas introducir");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        tabla = insertarOrdenado(tabla, valor);
        System.out.println(Arrays.toString(tabla));
    }
}
