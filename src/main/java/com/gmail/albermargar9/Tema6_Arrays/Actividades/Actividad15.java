package com.gmail.albermargar9.Tema6_Arrays.Actividades;

import java.util.Arrays;

public class Actividad15 {
    public static void main(String[] args) {
        int tabla1[] = {7,9,20};
        int tabla2[] = {7,9,20};
        System.out.println(tabla1 == tabla2);
        System.out.println(Arrays.equals(tabla1, tabla2));
    }

   /*
    ¿Qué mostrará el código por pantalla?
    False
    ¿Qué estamos comparando?
    Estamos comparando las referencias, y aunque las tablas tengan el mismo contenido son dos tabas diferentes ubicadas en distinto sitio en la memoria y por lo tanto sus referencias son distintas. •
    ¿Es posible comparar los elementos de la tabla con el operador = =?
    No es posible, porque así solo comparamos las referencias. */


}
