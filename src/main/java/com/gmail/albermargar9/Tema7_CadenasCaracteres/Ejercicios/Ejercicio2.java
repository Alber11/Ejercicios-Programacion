package com.gmail.albermargar9.Tema7_CadenasCaracteres.Ejercicios;

//Diseñar una función
//public static void mostrarCadena(String cadena)
//que recorre la cadena y muestra sus caracteres por pantalla.
//Diseñar una función
//public static void mostrarCadenaInversa(String cadena)
//que muestra la cadena por pantalla en orden inverso.
//Crea un main para probar las funciones.

public class Ejercicio2 {
    public static void mostrarCadena (String cadena){
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i));
        }
    }

    public static void mostrarCadenaInversa (String cadena){
        for (int i = cadena.length()-1; i>=0 ; i--) {
            System.out.print(cadena.charAt(i));
        }
    }

    public static void main(String[] args) {
        String cadena = "devuelve la longitud de la cadena";
        mostrarCadena(cadena);
        System.out.println();
        mostrarCadenaInversa(cadena);
    }
}
