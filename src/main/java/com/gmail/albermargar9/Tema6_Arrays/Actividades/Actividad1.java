package com.gmail.albermargar9.Tema6_Arrays.Actividades;

import java.util.Arrays;

//1. Crea una tabla de tipo booleano de 10 elementos
//2. ¿A qué valores esperas que esté inicializada?
//3. Comprueba tu respuesta empleando la instrucción:
//System.out.println(Arryas.toString(nombreArray));

public class Actividad1 {
    public static void main(String[] args) {
        boolean[] ejemplo;
        ejemplo = new boolean[10];
        boolean[] ejemplo2 = new boolean[10];
        System.out.println(Arrays.toString(ejemplo));
        System.out.println(Arrays.toString(ejemplo2));
    }
}
