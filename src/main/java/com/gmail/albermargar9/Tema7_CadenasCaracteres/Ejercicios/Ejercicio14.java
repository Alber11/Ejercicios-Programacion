package com.gmail.albermargar9.Tema7_CadenasCaracteres.Ejercicios;

//Crea una función
//public static String pasarAMayusculas(String cadena)
//que recibe una y devuelve una copia de la cadena en mayúsculas.
//Utiliza las funciones toCharArray() y valueOf()

public class Ejercicio14 {
    public static String pasarAMayusculas(String cadena){
        char tabla[] = cadena.toCharArray();
        for (int i = 0; i < tabla.length; i++) {
            if (Character.isLowerCase(tabla[i])){
                tabla[i] = Character.toUpperCase(tabla[i]);
            }
        }
        return String.valueOf(tabla);
    }

    public static void main(String[] args) {
        String cadena = "HOla Que Tal";
        System.out.println(cadena);

        String mayuscula = pasarAMayusculas(cadena);
        System.out.println(mayuscula);
    }
}
