package com.gmail.albermargar9.Tema6_Arrays.Actividades;

import java.util.Arrays;

//1. Asigna a la tabla de la actividad 1 los siguientes valores:
//        [true, true, true, true, true, false, false, false, false, false]
//      Muestra la tabla por pantalla.
//      Modifica el elemento que se encuentra en la posición 4 y asígnale un false.
//      Muestra el elemento de la posición 4 por pantalla.
//2. Construye y muestra las tablas siguentes:
//      Muestra el elemento el primer elemento que aparece en la tabla tiempos.
//      Muestra el último elemento que aparece en la tabla tiempos.
//      Multiplica el elemento del medio de la tabla tiempos por el penúltimo elemento
//      de la tabla punto. Muestra el resultado por pantalla.

public class Actividad2 {
    public static void main(String[] args) {
        double[] tiempos = new double[3];
        tiempos[0] = 1.27;
        tiempos[1] = 0.3;
        tiempos[2] = 0.0;
        int [] puntos = new int[6];
        puntos[0]=5;
        puntos[1]=-1;
        puntos[2]=0;
        puntos[3]=2;
        puntos[4]=0;
        puntos[5]=-7;
        System.out.println(Arrays.toString(tiempos));
        System.out.println(Arrays.toString(tiempos));
        System.out.println(tiempos[1]); //impirmimos solo la posicion 1
        System.out.println(puntos[0]);
    }
}
