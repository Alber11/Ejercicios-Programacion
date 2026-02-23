package com.gmail.albermargar9.Tema6_Arrays.Actividades;

import java.util.Arrays;

//1. Crea una tabla de 20 elementos de tipo double, con el operador new.
//Imprime el contenido de la tabla.
//Asigna a todos los elemento con el valor 2.5 utilizando la función fill.
//2. Crea una tabla de 30 elementos de tipo int, con el operador new.
//Imprime el contenido de la tabla.
//Asigna:
//        - A los 10 primeros elementos el valor 1
//        - A los 10 siguientes elementos el valor 2
//        - A los 10 siguientes elementos el valor 3

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
