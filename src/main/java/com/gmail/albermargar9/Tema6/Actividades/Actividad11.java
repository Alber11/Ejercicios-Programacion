package com.gmail.albermargar9.Tema6.Actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {
        int tabla[] = new int[8];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tabla.length; i++) {
            System.out.println("introduce valor de tabla posicion " + i + ":");
            tabla[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(tabla));

        tabla = Arrays.copyOf(tabla, tabla.length+1);
        System.out.println("la tabla ha sido ampliada" + Arrays.toString(tabla)  + "intoduce un valor mas");
        tabla[tabla.length-1] = sc.nextInt();
        System.out.println(Arrays.toString(tabla));
    }
}
