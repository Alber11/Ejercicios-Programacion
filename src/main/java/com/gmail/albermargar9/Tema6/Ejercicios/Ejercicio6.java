package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        int [] tabla = new  int[10];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random()*1 + 100);
        }
        int suma = 0;
        //para calcular la suma creamos un variable donde se va a guardar
        for (int i = 0; i < tabla.length; i++) {
            suma+= tabla[i];
        }
        //con este bucle for sumamos sus elementos
        System.out.println(suma);
        System.out.println(Arrays.toString(tabla));
    }
}
