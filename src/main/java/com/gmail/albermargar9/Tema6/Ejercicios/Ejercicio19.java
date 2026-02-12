package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe el tamaño de la tabla");
        int longitud = sc.nextInt();
        int datos[] = new  int[longitud];

        for (int i = 0; i < datos.length; i++) {
            System.out.println("introduce un numero");
            datos[i] = sc.nextInt();
        }

        Arrays.sort(datos);

        int pares[] = new int[0];
        int impares[] = new int[0];

        for (int numero:datos){
            if(numero%2 == 0){
                pares = Arrays.copyOf(pares, pares.length+1);
                pares[pares.length-1]=numero;
            }else{
                impares = Arrays.copyOf(impares, impares.length+1);
                impares[impares.length-1]= numero;
            }
        }
        System.out.println("pares: " + Arrays.toString(pares));
        System.out.println("impares: " + Arrays.toString(impares));
    }
}
