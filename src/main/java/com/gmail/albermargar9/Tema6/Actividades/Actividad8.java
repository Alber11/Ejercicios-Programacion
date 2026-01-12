package com.gmail.albermargar9.Tema6.Actividades;

import java.util.Arrays;

public class Actividad8 {
    public static void cambiaElPrimero(int t[], int cambio){
        t[3] = cambio;
        //poscion en la tabla que va a cambiar el numero cambio
    }

    public static void main(String[] args) {
        int [] w = {2,3,4,7};
        //string principal
        int cambio = 4;
        //el cambio de numero
        System.out.println(Arrays.toString(w));
        cambiaElPrimero(w, cambio);
        //metemos el string y el cambio principal al metodo/funcion que hemos creado antes
        System.out.println(Arrays.toString(w));
    }
}
