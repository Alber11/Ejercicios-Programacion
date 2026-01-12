package com.gmail.albermargar9.actividades.actividad2;
import java.util.Scanner;


public class Imput {
    public static void main(String[] args) {
        //Scanner lector; crea la variable pero no apunta a ninguna zona de memmoria
        Scanner lector = new Scanner(System.in);
        //definimos variable
        int numero;
        //nos devuelve el valor del imput y lo asigna a la variable creada
        numero = lector.nextInt();
        //imprime el dato de la variable del imput
        System.out.println("el numero que estas pensando: "+ numero);


    }
}
