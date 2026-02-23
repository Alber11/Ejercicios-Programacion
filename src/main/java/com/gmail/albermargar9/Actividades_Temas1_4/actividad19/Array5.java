package com.gmail.albermargar9.Actividades_Temas1_4.actividad19;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        /* // ejercicio pero usando el Array.fill
        int valor;
        int [] tabla = new int[8];
        System.out.println("que valor quieres que tenga la tabla");
        Scanner sc = new Scanner(System.in);
        valor = sc.nextInt();
        Arrays.fill(tabla, valor);
        System.out.println(Arrays.toString(tabla));
         */
        Scanner sc = new Scanner(System.in);
        int [] miTabla = new int[8];//la tabla que nos piede el enunciado es de 8
        System.out.println("Dame el numero para rellenar");
        int valor = sc.nextInt();
        rellenar(miTabla,valor); //este es el metodo que hemos creado abajo que hace lo mismo qye el Array.fill
        //estamos llamando al metodo que  cramos abajo y le estamos pasando los parametros
        System.out.println(Arrays.toString(miTabla));

    }
    //como funciona el fill, estamos creando un metodo que hace los mismo que hace Array.fill
    public static void rellenar (int [] tabla, int valor){
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = valor;
            //va cambiando cada posicion de la tabla por el valor que le hemos dado
        }
    }

}
