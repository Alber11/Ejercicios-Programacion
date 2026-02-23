package com.gmail.albermargar9.Tema1.Actividades.actividad14;

import java.util.Scanner;

public class DoWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba S para continuar con el programa");
        String respuesta;
        do {
            System.out.println("desea continuar con el programa");
            respuesta = sc.nextLine();

        }while (respuesta.equals("s") || respuesta.equals("S"));
        System.out.println("programa finalizado");
    }
}
