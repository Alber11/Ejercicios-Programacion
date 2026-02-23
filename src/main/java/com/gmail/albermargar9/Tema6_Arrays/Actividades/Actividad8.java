package com.gmail.albermargar9.Tema6_Arrays.Actividades;

import java.util.Arrays;

//1. Crea la función public static void cambiaElPrimero(int t[], int cambio) que recibe
//como parámetros de entrada una tabla y el valor que se le asignará al primer elemento de la tabla.
//Por ejemplo, si recibe la referencia a la tabla {1, 5, 6} y como cambio 9, modificará el primer elemento
//de la tabla. La tabla pasará a contener los valores {9, 5, 6}
//La función también debe imprimir la referencia de la tabla.
//2. Por otra parte, crea una tabla en el main con 5 elementos, asígnale valores.
//3. Imprime su referencia.
//4. Imprime sus elementos con System.out.println(Arrays.toString(nombreTabla))
//5. Llama a la función cambiaElPrimero() pasándole la tabla y un valor.
//6. Imprime tras la llamada sus elementos con System.out.println(Arrays.toString(nombreTabla)) para
//visualizar que el cambio,

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
