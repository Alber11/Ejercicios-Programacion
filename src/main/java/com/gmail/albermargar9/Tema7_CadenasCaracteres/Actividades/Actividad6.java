package com.gmail.albermargar9.Tema7_CadenasCaracteres.Actividades;

//1. Emplea subString() para extraer “un sueño intranquilo” de la cadena “Una
//mañana, al despertar de un sueño intranquilo”.
//  2. Emplea subString(), indicando el inicio y el fin, para extraer “despertar de
//un sueño” de la cadena “Una mañana, al despertar de un sueño intranquilo”

public class Actividad6 {
    public static void main(String[] args) {
        String cadena = "Una mañana, al despertar de un sueño intranquilo";

        String sucadena = cadena.substring(28);
        System.out.println(sucadena);

        String subcadena2 = cadena.substring(15,36);
        System.out.println(subcadena2);
    }
}
