package com.gmail.albermargar9.Tema6_Arrays.Actividades;

import java.util.Arrays;
import java.util.Scanner;

//• Crea una tabla de longitud cero: tipo tabla[] = new tipo[0]
//• Pide al usuario que introduzca los valores de los números que quiere guardar en
//la tabla. Supongamos que son números positivos. El proceso de petición de
//número finalizará cuando el usuario introduzca -1.
//• Cada vez que el usuario introduce un número válido habrá que ampliar una
//posición la tabla con copyOf() y asignarle en la última posición [tabla.length-1] el valor introducido por el usuario.

public class Actividad12 {
    public static void main(String[] args) {
        int[] tabla = new int[0];
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un valor a la tabla ^fin = -1^");
        int valor = sc.nextInt();

        while (valor!=-1){
            tabla = Arrays.copyOf(tabla, tabla.length+1);
            tabla[tabla.length-1] = valor;
            System.out.println("introduce un valor a la tabla ^fin = -1^");
            valor = sc.nextInt();
        }

        System.out.println(Arrays.toString(tabla));
    }
}
