package com.gmail.albermargar9.Tema6_Arrays.Actividades;

import java.util.Arrays;

//• Crea la tabla tablaA = {2, 4, 6, 8, 10, 12, 14}
//• Crea la tabla tablaB = {3, 5, 7, 9, 11, 13, 15}
//• Utiliza la función System.arraycopy() para que el resultado final se:
//tablaA = {3, 5, 7, 8, 10, 12, 14}
//tablaB = {3, 5, 7, 8, 10, 12, 14}
//• Imprime el contenido de las tablas antes de los cambios y después de los cambios,
//¿cuántas tablas hay? Imprime las referencias

public class Actividad14 {
    public static void main(String[] args) {
        int tablaA[] = {2, 4, 6, 8, 10, 12, 14};
        int tablaB[] = {3, 5, 7, 9, 11, 13, 15};

        System.out.println("tabla A antes "+ Arrays.toString(tablaA));
        System.out.println("tabla b antes "+ Arrays.toString(tablaB));

        System.arraycopy(tablaB, 0, tablaA, 0,3);
        System.arraycopy(tablaA, 3, tablaB, 3, 4);

        System.out.println("tabla A despues "+ Arrays.toString(tablaA));
        System.out.println("tabla b despues "+ Arrays.toString(tablaB));

        System.out.println("refernecia tabla a " + tablaA);
        System.out.println("refernecia tabla b " + tablaB);
    }
}
