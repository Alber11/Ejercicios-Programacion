package com.gmail.albermargar9.Tema6.Actividades;

import java.util.Arrays;

public class Actividad10 {
    public static void main(String[] args) {
        int tabla[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("tabla original" + Arrays.toString(tabla));

        int copiaMitad[] = Arrays.copyOf(tabla, 5);
        System.out.println("copia tbala rango 5" + Arrays.toString(copiaMitad));

        int copiaUnoMas[] = Arrays.copyOf(tabla, tabla.length+1);
        System.out.println("copia con hueco mas" + Arrays.toString(copiaUnoMas));

        int copiaRango[] = Arrays.copyOfRange(tabla, 2, 9);
        System.out.println("copia rango 1 a 9" + Arrays.toString(copiaRango));
    }
}
