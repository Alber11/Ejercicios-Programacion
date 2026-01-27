package com.gmail.albermargar9.Tema7.EjerciciosEntregar;

import java.util.Scanner;

public class Alberto_Martin_Camel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba una frase: ");
        String entrada = sc.nextLine();

        String resultado = estiloCamel(entrada);
        System.out.println("Variable estilo Camel: " + resultado);

        sc.close();
    }

    public static String estiloCamel(String cadena) {
        String[] palabras = cadena.trim().split(" ");
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palabras.length; i++) {
            if (i == 0) {
                resultado.append(palabras[i].toLowerCase());
            } else {
                resultado.append(primeraMayuscula(palabras[i]));
            }
        }

        return resultado.toString();
    }

    public static String primeraMayuscula(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return "";
        }
        String primeraLetra = cadena.substring(0, 1).toUpperCase();
        String restoCadena = cadena.substring(1).toLowerCase();

        return primeraLetra + restoCadena;
    }
}
