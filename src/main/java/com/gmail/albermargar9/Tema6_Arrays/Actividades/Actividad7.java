package com.gmail.albermargar9.Tema6_Arrays.Actividades;

import java.util.Arrays;

//1. Construye una tabla a de 10 elementos del tipo de desees y asígnale valores.
//2. Declara diferentes variables de tabla b y c del mismo tipo, que referenciarán la tabla creada.
//3. Comprueba, imprimiendo por pantalla cada una de ellas, que todas las
//variables contienen la misma referencia. System.out.println(nombreTabla)
//4. Muestra el contenido asociado a cada referencia en cada caso, es el mismo
//contenido, porque están referenciando a la misma tabla.
//        System.out.println(Arrays.toString(nombreTabla))

public class Actividad7 {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] b; int [] c;
        b = a;
        c = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

    }
}
