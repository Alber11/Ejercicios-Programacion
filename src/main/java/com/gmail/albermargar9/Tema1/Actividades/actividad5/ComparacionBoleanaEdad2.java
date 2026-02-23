package com.gmail.albermargar9.Tema1.Actividades.actividad5;

import java.util.Scanner;

public class ComparacionBoleanaEdad2 {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.print("Dame un numero entero");
        int numero = lector.nextInt();
        //Comprobar si es par o impar
        /*Para comprobar si es par o impar necesitamos ver si es dibisble entre 2
        y si su resto es 0 significa que es par, pero si es distinto a 0 es impar*/
        boolean par = numero % 2 == 0; //nos dice el valor del resto de una division
        boolean impar = numero % 2 != 0;
        //imprimimos si es para o impar
        System.out.println("es par? " + par);
        System.out.println("es impar? " + impar);


    }


}
