package com.gmail.albermargar9.Tema6.Actividades;

import java.util.Arrays;

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
