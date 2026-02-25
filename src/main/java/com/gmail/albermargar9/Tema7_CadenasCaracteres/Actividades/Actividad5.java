package com.gmail.albermargar9.Tema7_CadenasCaracteres.Actividades;

//• Prueba las siguientes funciones según las indicaciones. • Se invocan haciendo referencia a la clase:
//        Character.isDigit(caracter)
//Character.isLetter(caracter)
//• Invócalas de tal manera que obtenga, mínimo, tanto un true
//como un false para cada caso.

public class Actividad5 {
    public static void main(String[] args) {
        System.out.println(Character.isDigit('a'));//False
        System.out.println(Character. isDigit(' '));//False
        System.out.println(Character.isDigit('9'));//True
        System.out. println();

        System.out.println(Character.isLetter('a'));//True
        System.out.println(Character.isLetter('N'));//True
        System.out.println(Character.isLetter('*'));
        System.out.println();//False

        System.out.println(Character.isLetterOrDigit('a'));//True
        System.out.println(Character.isLetterOrDigit('9'));//Trve
        System.out.println(Character.isLetterOrDigit('*'));//False
        System.out.println();

        System.out.println(Character.isLowerCase('a'));//True
        System.out.println(Character.isLowerCase('N'));//False
        System.out.println(Character.isLowerCase('9'));//False
        System.out.println();

        System.out.println(Character.isUpperCase('a'));//False
        System.out.println(Character.isUpperCase('N'));//True
        System.out.println(Character.isUpperCase('9'));//False
        System.out.println();

        System.out.println(Character.isSpaceChar(' '));//True
        System.out.println(Character.isSpaceChar('\t'));//False
        System.out.println(Character.isSpaceChar('m'));//False
        System.out.println();

        System.out.println(Character.isWhitespace(' '));//True
        System.out.println(Character.isWhitespace('\t'));//True
        System.out.println(Character.isWhitespace('m'));//True
        System.out.println(Character.isWhitespace('\\'));//True
        System.out.println();
    }
}
