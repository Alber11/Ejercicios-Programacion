package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

//Implementa la función:
//public static int[] buscarTodos(int t[], int valorBuscado),
//que crea y devuelve una tabla con todos los índices donde se encuentra el valorBuscado.
//En el caso de que el valorBuscado no se encuentre en la tabla t, la función devolverá una tabla vacía.

public class Ejercicio20 {
    public static int[] buscarTodos(int tabla[], int calve){
        int encontradoEn[] = new int[0];

        for (int i = 0; i < tabla.length; i++) {
            if(tabla[i] == calve){
                encontradoEn = Arrays.copyOf(encontradoEn, encontradoEn.length+1);
                encontradoEn[encontradoEn.length-1] = i;
            }
        }
        return encontradoEn;
    }

    public static void main(String[] args) {
        int tabla[] = {1, 2, 5, 3, 2, 5, 4, 3, 4, 1, 2, 5, 1, 3, 2};
        System.out.println(Arrays.toString(tabla));

        Scanner sc = new Scanner(System.in);
        System.out.println("escribe el numero que deseas buscar: ");
        int elemento = sc.nextInt();
        int indices[] = buscarTodos(tabla, elemento);

        if (indices.length>0){
            System.out.println("el numero " + elemento + "se necuentra en los indices" + Arrays.toString(indices));
        }else {
            System.out.println("no se han encontrado coincidencias");
        }
    }
}
