package com.gmail.albermargar9.Tema6.Ejercicios;

public class Ejercicio2 {
    public static void mostrar(int [] tabla){
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }
        //recoremos la tabla con el bucle for y cada instruccion del for nos dice en que posicion de la tabla está
    }

    public static void main(String[] args) {
        int [] tabla = {1, 4, 8, 9, 12};
        mostrar(tabla);
    }
}
