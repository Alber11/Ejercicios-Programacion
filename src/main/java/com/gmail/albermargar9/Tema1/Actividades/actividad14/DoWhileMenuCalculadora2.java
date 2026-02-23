package com.gmail.albermargar9.Tema1.Actividades.actividad14;

import java.util.Scanner;

public class DoWhileMenuCalculadora2 {
    public static void main(String[] args) {
        int opcion, numero;
        Scanner sc = new Scanner(System.in);
        do {//creamos un menu para que usuario elija la opcion
            System.out.println("Elija una opcion:");
            System.out.println("1. Calculara su cuadrado");
            System.out.println("2. Calcular su valor");
            System.out.println("3. Calcular su raiz cuadrada");
            System.out.println("4. Salir");
            opcion = sc.nextInt(); // leemos la opcion

            if (opcion !=4){ //si la opcion es distinta de 4
                System.out.println("Introduce un numero");
                numero = sc.nextInt(); //pedimos el numero que hara los calculos

                switch (opcion){ //depenediendo de la opcion elejida por el usuario hara la operacion coveniente
                    case 1 -> System.out.println(numero + "^2 " + " = " + Math.pow(numero, 2));
                    case 2 -> System.out.println("|" + numero + "| " + " = " + Math.abs(numero));
                    case 3 -> System.out.println("Raiz cuadrada de " + numero + " = " + Math.sqrt(numero));
                }
            }

        } while (opcion != 4);//terinara el bucle cuando la opcion es false
        //como hemos puesto que opcion es distnta de 4 sera true y ejecutara el bucle del menu hasta que teclemos 4 y ya no sera
        //true entonces el programa finaliza

    }
}
