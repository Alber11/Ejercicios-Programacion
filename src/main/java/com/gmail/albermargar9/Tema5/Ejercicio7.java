package com.gmail.albermargar9.Tema5;

import java.util.Scanner;

public class Ejercicio7 {
    public static void calcularAreaCilindro (int radio, int altura){
        System.out.println("El area es = " + 2*Math.PI*radio*(altura*radio));
    }
    public static void calcularVolumenCilindro (int radio, int altura){
        System.out.println("El volumen es= " + Math.PI*Math.pow(radio,2)*altura);
    }
    public static void calcualrAreaOVolumenCilindro (int radio, int altura, int opcion){
        switch (opcion){
            case 1 -> calcularAreaCilindro(radio, altura);
            case 2 -> calcularVolumenCilindro(radio, altura);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la altura");
        int altura = sc.nextInt();
        System.out.println("Escriba el radio");
        int radio = sc.nextInt();
        System.out.println("Opciones");
        System.out.println("1- Calcular Area");
        System.out.println("2- Calcular Volumen");
        int opcion = sc.nextInt();
        calcualrAreaOVolumenCilindro(radio, altura, opcion);
    }

}
