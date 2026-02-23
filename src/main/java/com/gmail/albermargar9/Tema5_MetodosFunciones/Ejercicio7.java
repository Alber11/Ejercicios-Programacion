package com.gmail.albermargar9.Tema5_MetodosFunciones;

import java.util.Scanner;

//1. Define una función calcularAreaCilindroque reciba el radio y la altura.
// 2. Define una función calcularVolumenCilindroque recibe el radio y la altura.
// 3. Define una función
//      calcualrAreaOVolumenCilindro(), se le pasará el
//      radio, la altura y una opción. Si la opción recibe el valor 1 invocará a la función área; si recibe el valor 2
//      invocará a la función área.
//4. Crea un main que solicite los datos y pruebe la función calcularAreaOPerimetro().


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
