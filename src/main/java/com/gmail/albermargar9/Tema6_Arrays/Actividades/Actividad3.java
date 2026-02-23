package com.gmail.albermargar9.Tema6_Arrays.Actividades;

import java.util.Arrays;

//1. Crea una tabla [false, true, false, false, true] por asignación. Comprueba tu creación con la instrucción:
//        System.out.println(Arrays.toString(nombreArray))
//      Imprime el segundo elemento de la tabla.
//2. Crea otra tabla con los mismos valores empleando el método de creación
//      con el operador new.
//      Comprueba tu creación con la instrucción:
//        System.out.println(Arryas.toString(nombreArray))
//      Imprime el cuarto elemento de la tabla.

public class Actividad3 {
    public static void main(String[] args) {
        boolean [] tabla = {false, true, false, false, true};
        System.out.println("Tabla:" + Arrays.toString(tabla));
        System.out.println("Segunda posicion: " + tabla[1]);

        boolean [] tabla2 = new boolean[5];
        tabla2[0] = false;
        tabla2[1] = true;
        tabla2[2] = false;
        tabla2[3] = true;
        tabla2[4] = false;
        System.out.println("Tabla2: " + Arrays.toString(tabla2));
        System.out.println("Tercera posicion: " + tabla2[2]);
    }
}
