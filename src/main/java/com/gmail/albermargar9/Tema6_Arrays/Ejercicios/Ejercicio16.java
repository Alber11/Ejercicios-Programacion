package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

//• Definir una función
//public static int[ ] copiar(int tabla[ ])
//que recibe una tabla y devuelve una copia de la tabla.
//• Crea un main que solicite al usuario la longitud de una tabla y sus valores.
//Después una nueva variable de tipo tabla a la que le asignaremos el resultado de la función copia (int copia[] = copiar(tabla);).
//• Imprime el contenido de cada tabla. Imprime la referencia de cada tabla.

public class Ejercicio16 {
    public static int[] copia(int tabla[]){
        int copia[] = new int[tabla.length];

        for (int i = 0; i < tabla.length; i++) {
            copia[i] = tabla[i];
        }
        return copia;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la longitud de la tabla");
        int longitud = sc.nextInt();

        int tabla[] = new int[longitud];
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("introduce el valor en la posicion" + i + ":");
            tabla[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(tabla));
        System.out.println(tabla);

        int copia[] = copia(tabla);
        System.out.println(Arrays.toString(tabla));
        System.out.println(tabla);
    }
}
