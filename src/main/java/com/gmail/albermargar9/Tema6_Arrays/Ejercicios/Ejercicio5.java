package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

//Crea una tabla de longitud 20 he inicializa los elementos desde la posición 5 hasta la posición 15 con un valor solicitado al usuario. Para inicializar los elementos utiliza un bucle for.
//Ejemplo de ejecución:
//Introduce un valor
//4
//        [0, 0, 0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 0, 0]
//Transforma el código en una función:
//public static void rellenar(int tabla[], int desde, int hasta, int valor)
//Esta función rellana las posiciones empezando en desde y acabando en hasta-1.
//E invoca a la función en el main.

public class Ejercicio5 {
    public static void rellenar(int [] tabla, int valor){
        Arrays.fill(tabla, 5, 15, valor);
    }
    public static void rellenar2(int [] tabla2, int desde, int hasta, int valor){
        for (int i = desde; i < hasta ; i++) {
            tabla2[i]=valor;
        }
    }
    public static void main(String[] args) {
        int [] tabla = new int[20];
        int [] tabla2 = new int[20];
        System.out.println("Introduce el valor");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        rellenar(tabla, valor);
        rellenar2(tabla2, 5, 15, valor);
        System.out.println(Arrays.toString(tabla));
        System.out.println(Arrays.toString(tabla2));
        
    }
}
