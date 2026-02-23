package com.gmail.albermargar9.Tema1.Actividades.actividad8;

import java.util.Scanner;

public class OperadorTernarioValorAbsoluto1 {
    public static void main(String[] args){
        int numero, numero2;
        Scanner lector = new Scanner(System.in);
        System.out.print("Escriba un numero: ");
        numero = lector.nextInt();
        //el valor que le das es true el programa ejecuta el primer valor entre :
        // si es false ejecuta el segundo valor de :
        numero2 = (numero > 0) ? (-numero):(numero);
        System.out.println("El valor de absoluto de " + numero + " es:" + numero2);




    }

}
