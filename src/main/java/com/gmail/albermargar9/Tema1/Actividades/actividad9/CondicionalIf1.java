package com.gmail.albermargar9.Tema1.Actividades.actividad9;

import java.util.Scanner;

public class CondicionalIf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digame un numero par por favor: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) { //si el numero es par va ejecutar la linea de comados que estan dentro de los corchetes
            System.out.println("tu numero al cuadrado es: " + numero * numero);

        }
        if (numero % 2 != 0) { //si el numero es impar va a jecutar lo de dentro de los corchetes
            System.out.println("ese numero es impar");
        }

    }
}