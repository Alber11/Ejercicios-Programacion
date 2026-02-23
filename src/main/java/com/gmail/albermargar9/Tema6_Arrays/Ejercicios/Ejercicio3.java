package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Arrays;

//Crea una tabla de enteros de longitud 8. Inicialízala utilizando un for con los
//números:
//        1, 2, 3, 4, 5, 6, 7, 8

public class Ejercicio3 {
    public static void main(String[] args) {
        int [] tabla = new int[8];
        for (int i = 0; i < tabla.length ; i++) {
            tabla[i] = i+1;
        }
        //en el bucle for estamos rellenado cada posicion +1 y como es una de tamño 8 pues concatena imprimiendo una 1 + 1
        System.out.println(Arrays.toString(tabla));
    }
}
