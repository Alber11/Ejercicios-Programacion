package com.gmail.albermargar9.Tema6.Actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        int[] tabla = new int[0];
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un valor a la tabla ^fin = -1^");
        int valor = sc.nextInt();

        while (valor!=-1){
            tabla = Arrays.copyOf(tabla, tabla.length+1);
            tabla[tabla.length-1] = valor;
            System.out.println("introduce un valor a la tabla ^fin = -1^");
            valor = sc.nextInt();
        }

        System.out.println(Arrays.toString(tabla));
    }
}
