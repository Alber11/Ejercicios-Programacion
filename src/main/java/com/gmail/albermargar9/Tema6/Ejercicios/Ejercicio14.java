package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

    public static int buscar(int tabla[], int clave){
        int posicion;
        int i = 0;

        while(i< tabla.length && tabla[i] !=clave){
            i++;
        }

        if (i< tabla.length){
            posicion = i;
        }else {
            posicion = -1;
        }

        return posicion;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe la longitud de la tabla");
        int longitud = sc.nextInt();

        int tabla [] = new int[longitud];

        for (int i = 0; i < tabla.length; i++) {
            System.out.println("introduce un numero");
            tabla[i] = sc.nextInt();
        }

        System.out.println("Escribe la clave que quieres buscar");
        int clave = sc.nextInt();

        int posicion = buscar(tabla, clave);
        System.out.println(Arrays.toString(tabla));
        if(posicion == -1) {
            System.out.println("Clave no encontrada");
        } else {
            System.out.println("la calve esta en el indice" + posicion);
        }
    }
}
