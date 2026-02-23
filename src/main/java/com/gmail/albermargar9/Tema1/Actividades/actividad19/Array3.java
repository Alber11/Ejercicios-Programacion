package com.gmail.albermargar9.Tema1.Actividades.actividad19;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] tabla = {5,7,9,4,1};
        System.out.println(tabla);
        System.out.println(Arrays.toString(tabla));
        cambiaElPrimero(tabla, 9999);
        System.out.println(Arrays.toString(tabla));

    }
    public static void cambiaElPrimero(int[] t, int cambio){
        t[0] = cambio;

    }
}
