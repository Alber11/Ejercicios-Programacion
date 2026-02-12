package com.gmail.albermargar9.Tema6.Ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio17 {
    public static int[ ] copiar(int tabla[ ], int longitud){
        int copia[] = new int[longitud];
        int rango = longitud < tabla.length ? longitud : tabla.length;
        for (int i = 0; i < rango; i++) {
            copia[i]=tabla[i];
        }
        return copia;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inroduce la longitud de la tabla: ");
        int longitud = sc.nextInt();

        int tabla[] = new int[longitud];
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("introduce el valor de la posicion" + i + ":");
            tabla[i]=sc.nextInt();
        }
        System.out.println("Tabla original: " + Arrays.toString(tabla));
        System.out.println(tabla);

        int copiaCorta[] = copiar(tabla, 3);
        System.out.println("Copia de longitud 3: " + Arrays.toString(copiaCorta));
        System.out.println(copiaCorta);

        int copiaLarga[] = copiar(tabla, 7);
        System.out.println("Copia de longitud 7: " + Arrays.toString(copiaLarga));
        System.out.println(copiaLarga);

    }
}
