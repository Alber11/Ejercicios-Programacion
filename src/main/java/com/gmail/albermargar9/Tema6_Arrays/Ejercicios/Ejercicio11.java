package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Scanner;

//Escribir un programa que solicite al usuario cuántos números desea introducir en un array. A continuación, solicita uno
// a uno cada uno de los elementos y guárdalos en el array. Por último, mostrar los elementos por pantalla en orden inverso al introducido.
//¿Cuántos números deseas introducir?4
//Introduce un número: 1
//Introduce un número: 2
//Introduce un número: 3
//Introduce un número: 4
//Los números en orden inverso son:
//        4 3 2 1

public class Ejercicio11 {
    public static void main(String[] args) {
        int sice;
        Scanner sc = new Scanner(System.in);
        System.out.println("que tamaño quieres que tenga la tabla: ");
        sice = sc.nextInt();
        int [] tabla = new int[sice];
        for (int i = 0; i < sice; i++) {
            System.out.println("introduce el numero de la posicion: " + i);
            tabla[i] = sc.nextInt();
        }
        System.out.println("los numeros introducidios a la inversa: ");
        //bucle for para mostrar una tabla a la inversa
        for (int i = tabla.length -1; i >= 0; i--) {
            System.out.print(tabla[i] + " ");
        }
    }
}
