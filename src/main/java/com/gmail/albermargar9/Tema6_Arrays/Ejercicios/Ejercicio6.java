package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Arrays;

//Crea una tabla de longitud 10 que se inicializará con número aleatorios
//comprendidos entre 1 y 100 utilizando un for.
//Después, recorre de nuevo la tabla con un for para sumar todos los números
//aleatorios. Muestra la suma de todos los números aleatorios guardados en la tabla.

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
