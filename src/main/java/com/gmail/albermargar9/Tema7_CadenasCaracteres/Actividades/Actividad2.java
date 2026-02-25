package com.gmail.albermargar9.Tema7_CadenasCaracteres.Actividades;

//1. Utiliza un print para mostrar:
//Un carácter precedido de una barra invertida (\)
//se conoce como “secuencia de escape”
//2. Utiliza un print para mostrar
//Carácter A
//Hexadecimal \u0041
//Decimal 65
//3. Un print que muestre
//“\t \n”

public class Actividad2 {
    public static void main(String[] args) {
        System.out.println("Un carácter precedido de una barra invertida (\\) \n"
                + "se conocer como \"secuencia de escape\" ");

        System.out.println("Carácter\tA\n"
                + "Hexadecimal\t\\u0041\n"
                + "Decimal\t\t65");

        System.out.println("\"\\t\t\\n\"");
    }
}
