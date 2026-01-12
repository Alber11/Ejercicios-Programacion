package com.gmail.albermargar9.Tema6.Actividades;

import java.util.Arrays;

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
