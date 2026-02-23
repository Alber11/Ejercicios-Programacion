package com.gmail.albermargar9.Tema1.Actividades.actividad13;

import java.util.Scanner;

public class WhileMultiplosDe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula cuantos multiplos de 4 has introducido");
        System.out.println("- El programa no especifica que numeros son los multiplos de 4");
        System.out.println("- El programa finaliza cuando escribas 0");
        System.out.println("- Introduce cuantos numeros quieras");
        System.out.println("**************************************************************");
        System.out.println("Escriba un numero entero:");
        int num = sc.nextInt();
        int counter = 0; //creamos un contador
        int minor = num; // igualamos la variable menor a lade numero introducuido
        while (num != 0){ // hacemos while para pedir numero hasta que sea 0
            if (num % 4 == 0){ // si es multipplo de 4 simara uno a la cifra del contador
                counter++;
            }
            if (num < minor){
                // cuando el numero sea menor que el numero introducido
                // se guaradara en la variable minor de manera definitiva
                minor = num;
            }
            System.out.println("Escriba otro numero");// aqui pedimos el consecutivamente hasta que sea 0
            num = sc.nextInt();
        }


        System.out.println("El numero de multiplos de 4 es: " + counter);
        System.out.println("El numero mas peuqeño es: " + minor);

    }
}
