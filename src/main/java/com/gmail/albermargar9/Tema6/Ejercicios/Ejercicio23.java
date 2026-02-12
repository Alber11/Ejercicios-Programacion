package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio23 {
    public static int[] eliminarMayores(int tabla[], int valor){
        int copia[] = Arrays.copyOf(tabla, tabla.length);
        int i=0;

        while(i<copia.length){
            if (copia[i]>valor){
                copia[i] = copia[copia.length-1];
                copia = Arrays.copyOf(copia, copia.length-1);
            }else {
                i++;
            }
        }
        return copia;
    }

    public static void main(String[] args) {
        int tabla[] = new int[10];

        for (int i=0; i<tabla.length; i++){
            tabla[i] = (int) (Math.random()*1000+1);
        }

        System.out.println("datos" + Arrays.toString(tabla));

        System.out.println("eliminar los mayores que: ");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        int sinMayores[] = eliminarMayores(tabla, valor);

        System.out.println(Arrays.toString(tabla));
        System.out.println(Arrays.toString(sinMayores));
    }

}
