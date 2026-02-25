package com.gmail.albermargar9.Tema7_CadenasCaracteres.Actividades;

//1. Busca el code point del carácter á en decimal y en hexadecimal.
//2. Busca el code point del carácter ¿ en decimal y en hexadecimal.
//3. Busca el code point del carácter ♡ en decimal y en hexadecimal.
//4. Declara en Eclipse dos variables de tipo char. Asígnale a la primera
//las representaciones de á y a la segunda las representaciones de ¿.
//Imprime por pantalla sus valores.

public class Actividad1 {
    public static void main(String[] args) {
        char caracter1 = 'å';
        System.out.println("Caracter a:" +caracter1);

        caracter1 = 225;
        System.out.println("Caracter a representado mediante el code point decimal: " + caracter1);

        caracter1 = '\u00E1';
        System.out.println("Caracter a representado mediante el code point hexadecimal: " + caracter1);

        char caracter2 = '¿';
        System.out.println("Caråcter ¿: " + caracter1);

        caracter2 = 191;
        System.out.println("Caracter ¿ representado mediante el code point decimal: " + caracter2);

        caracter2 = '\u08BF';
        System.out.println("Caracter ¿ representado mediante el code point hexadecimal: " + caracter2);

        char caracter3 = 9825;
        System.out.println("Caracter corazon representado mediante el code point decimal: " + caracter3);

        caracter3 = '\u2661';
        System.out.println("Caracter corazon representado mediante el code point hexadecimal: " + caracter3);
    }
}
