package com.gmail.albermargar9.Tema7_CadenasCaracteres.Actividades;

//Dada la siguiente frase: Pablito clavó un clavito ¿qué clavito clavó Pablito?
//Utiliza el método split y el separador adecuado para obtener como
//resultado los siguientes arrays:
//        1) [, clavó un clavito ¿qué clavito clavó , ?]
//        2) [Pablito clavó un clavito , qué clavito clavó Pablito?]
//        3) [Pablito , ó un , ito ¿qué , ito , ó Pablito?]

import java.util.Arrays;

public class Actividad11 {
    public static void main(String[] args) {
        String frase = "Pablito clavó un clavito ¿qué clavito clavó Pablito?";

        String pablito[] = frase.split("Pablito");
        System.out.println(Arrays.toString(pablito));

        String interrogacion[] = frase.split("¿");
        System.out.println(Arrays.toString(interrogacion));

        String clav[] = frase.split("clav");
        System.out.println(Arrays.toString(clav));


    }
}
