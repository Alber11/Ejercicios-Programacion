package com.gmail.albermargar9.Tema6.Actividades;

import java.util.Arrays;

public class Actividad13 {
    public static void main(String[] args) {
        int tabla[] = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(tabla));

        for (int i = tabla.length; i>0; i--) {
            tabla = Arrays.copyOf(tabla, tabla.length-1);
            System.out.println(Arrays.toString(tabla));
        }
    }
}
