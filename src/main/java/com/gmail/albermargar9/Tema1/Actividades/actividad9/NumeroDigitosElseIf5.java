package com.gmail.albermargar9.Tema1.Actividades.actividad9;

import java.util.Scanner;

public class NumeroDigitosElseIf5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un numero: ");
        int num = sc.nextInt();
        //toda varibale declarada dentro de un metodo min tiene que tener asignado un valor antes de ser usado
        int digitos = 0;
        if (num < 0 || num > 99999){ //hacemos una comprovacion de seguridad por si nos dan un numero fuera de ese rango
            System.out.println("Numero fuera de rango");
        } else if (num < 10) { //si el numero es menor que 10 solo puede tener 1 digito
            digitos = 1;
        } else if (num < 100) {
            digitos = 2;
        }else if (num < 1000) {
            digitos = 3;
        }else if (num < 10000) {
            digitos = 4;
        }else if (num < 100000){
            digitos = 5;
        }
        /*esto lo hacemos por no repetir muchos print en cada (else if), estamos diciendo al prorgama que
        solo si el digito es distinto que(!=) 0 se va a imprimir el numero de digitos*/
        if (digitos != 0){
            System.out.print("Tu numero tiene: " + digitos + " digitos");
        }
        // podemos calcular los numero se dijitos de un numero resolviendo el logaritmo de 10 de ese numero
        // System.out.println("Numero de digitos: " + (int)(Math.log10(Math.abs(num))+1));


    }
}
