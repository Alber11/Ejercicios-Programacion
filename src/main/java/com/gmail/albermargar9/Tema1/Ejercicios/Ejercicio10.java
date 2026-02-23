package com.gmail.albermargar9.Tema1.Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

//   Solicitar al usuario dos números: a y b. Deberá mostrarse true si ambos números son
//   iguales y false en caso contrario.
//   Ejemplo de salida esperada al introducir un número impar:
//   Escriba a:
//           13
//   Escriba b:
//           14
//   Son iguales: false
//   Ejemplo de salida esperada al introducir un número par:
//   Escriba a:
//           23
//   Escriba b:
//           23
//   Son iguales: true

    public static void main(String[] args) {
       int numA, numB;
       boolean resultado;
       Scanner sc = new Scanner(System.in);
       System.out.println("Escriba un numero: ");
       numA = sc.nextInt();
       System.out.println("Escriba otro numero: ");
       numB = sc.nextInt();
       resultado = numA == numB;
       System.out.println("Son iguales: " + resultado);
    }
}
