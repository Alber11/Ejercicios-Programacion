package com.gmail.albermargar9.actividades.actividad19;


import java.util.Arrays;
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //el programa saca una tabla ordenada de longitud
        //specifica que se encuenra rellena de numeros aleatorios
        System.out.println("Dame longitud y fin, (Lonjitud, fin)");
        int longitud, fin;
        longitud = sc.nextInt();
        fin = sc.nextInt();
        int[] arrayDePares;
        arrayDePares = rellenaPares(longitud, fin);
        System.out.println(Arrays.toString(arrayDePares));


    }
    static public int[] rellenaPares(int longitud, int fin){
        int[] listaPares= new int[longitud];
        for (int i = 0; i < listaPares.length; i++) {
            listaPares[i] = calcularParAleatorio(2, fin);
        }
        //Tenemos el array lleno con aleatorios pares
        Arrays.sort(listaPares);
        return listaPares;
    }

    static public int calcularParAleatorio(int menor, int mayor){
        int numero;
        do {
            numero = (int)(Math.random() * mayor - 1) +  menor;
        }while (numero % 2 != 0);
        return numero;
    }
}
