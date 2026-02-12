package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Arrays;

public class Ejercicio22 {
    public static int buscar(int tabla[], int calve){
        int posicion;
        int i = 0;

        while (i< tabla.length && tabla[i] != calve){
            i++;
        }

        if (i< tabla.length){
            posicion = i;
        }else{
            posicion = -1;
        }

        return posicion;
    }

    public static int[] eleminarNoOrdenado (int tabla[], int valor){
        int indiceBorrado = buscar(tabla, valor);

        if (indiceBorrado!=-1){
            tabla[indiceBorrado]= tabla[tabla.length-1];
            tabla = Arrays.copyOf(tabla, tabla.length-1);
        }
        return tabla;
    }

    public static void main(String[] args) {
        int tabla[] = {1,3,7,2,4,5};
        System.out.println(Arrays.toString(tabla));
        tabla = eleminarNoOrdenado(tabla, 7);
        System.out.println(Arrays.toString(tabla));
    }
}
