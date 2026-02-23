package com.gmail.albermargar9.Tema6_Arrays.Actividades;

import java.util.Arrays;

//• Crea una tabla de 10 elementos y asígnales valores. • Emplea la función copyOf() para realizar una copia de la tabla que incluya los 5 primeros
//elementos. • Emplea la función copyOf() para realizar una copia de la tabla con un hueco más. • Emplea la función copyOfRange() para realizar una copia de la tabla que incluya los elementos de la posción 2 a la posición 8.
//• Imprime en cada paso el contenido de las tablas resultantes.

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
