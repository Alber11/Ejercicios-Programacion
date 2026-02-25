package com.gmail.albermargar9.Tema7_CadenasCaracteres.Actividades;

//¿Qué diferencia existe entre compreTo() y equals()?s
//compareTo() compara alfabéticamente, indicando si la cadena invocante es menor, mayor o igual albéticamenteque la pasada como parámetro. En cambio, equals() compara si la secuencia de caracteres es la misma,
//devolviendo true en este caso, y false en caso contrario.

public class Actividad9 {
    public static void main(String[] args) {
        String cadena1 = "Alondra";
        String cadena2 = "Nutria";
        String cadena3 = "Zorro";

        //Nutria es mayor que Alondra, muestra un número positivo
        System.out.println(cadena2.compareTo(cadena1));

        //Nutria es menor que Zorro, muestra un número negativo
        System.out.println(cadena2.compareTo(cadena3));
    }
}
