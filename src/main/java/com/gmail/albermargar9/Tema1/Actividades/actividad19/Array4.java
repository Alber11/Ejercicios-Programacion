package com.gmail.albermargar9.Tema1.Actividades.actividad19;

import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        double [] tabla = new double[20];
        Arrays.fill(tabla, 2.5);
        int [] tabla2 = new int[30];
        Arrays.fill(tabla2, 0, 10, 1);
        Arrays.fill(tabla2, 10, 20, 2);
        Arrays.fill(tabla2, 20, 30, 3);
        System.out.println(Arrays.toString(tabla2));
        System.out.println(Arrays.toString(tabla));
    }
}
