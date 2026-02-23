package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

//Crea una tabla de longitud 6 elementos.
//Utiliza un valor para inicializar cada uno de los elementos. Los valores los elegirá el usuario, es decir, los introducirá por teclado.

public class Ejercicio7 {
    public static void main(String[] args) {
        int [] tabla = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Introduces el valor en la posicion" + i);
            tabla[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(tabla));
    }
}
