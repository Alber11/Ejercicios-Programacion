package com.gmail.albermargar9.Tema6.Actividades;

import java.util.Arrays;

public class Actividad9 {
    public static void main(String[] args) {
        double [] tabla = new double[20];
        System.out.println(Arrays.toString(tabla));
        Arrays.fill(tabla, 2.25);
        System.out.println(Arrays.toString(tabla));
        int [] tabla2 = new int [30];
        System.out.println(Arrays.toString(tabla2));
        Arrays.fill(tabla2, 0, 10, 1);
        Arrays.fill(tabla2, 10, 20, 2);
        Arrays.fill(tabla2, 20, 30, 3);
        System.out.println(Arrays.toString(tabla2));
    }
}
