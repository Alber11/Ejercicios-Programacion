package com.gmail.albermargar9.Tema6_Arrays.Actividades;

import java.util.Arrays;
import java.util.Scanner;

//• Pide a los usuarios los valores necesarios para rellenar una tabla de 8 elementos.
//• Amplía la tabla una posición. Solicita al usuario el valor para elemento de la
//última posición.
//• Muestra la tabla antes y después

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
