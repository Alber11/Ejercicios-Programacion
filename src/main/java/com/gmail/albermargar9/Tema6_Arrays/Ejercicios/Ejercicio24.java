package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

//Crea una función
//public static int[] eliminarOrdenado(int tabla[], int valor)
//que realice el borrado de un elemento de la tabla.

public class Ejercicio24 {
    public static int[] eliminarOrdenado(int tabla[], int valor){
        int indiceBorrado = Arrays.binarySearch(tabla, valor);
        if (indiceBorrado>=0){
            System.arraycopy(tabla, indiceBorrado +1, tabla, indiceBorrado, tabla.length - (indiceBorrado +1));
            tabla = Arrays.copyOf(tabla, tabla.length -1);
        }
        return tabla;
    }

    public static void main(String[] args) {
        int tabla[] = new int[10];

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random()*100);
        }

        Arrays.sort(tabla);
        System.out.println("datos" + Arrays.toString(tabla));

        System.out.println("que valor deseas eliminar?");
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

        tabla = eliminarOrdenado(tabla, valor);
        System.out.println(Arrays.toString(tabla));
    }
}
