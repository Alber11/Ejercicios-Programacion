package com.gmail.albermargar9.Tema6.Actividades;

import java.util.Arrays;

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
