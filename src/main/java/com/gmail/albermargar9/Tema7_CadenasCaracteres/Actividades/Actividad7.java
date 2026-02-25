package com.gmail.albermargar9.Tema7_CadenasCaracteres.Actividades;

//1. Elimina con una sola función los espacios en blanco de la cadena:
//        “   Mi perro se llama Perico          ”
//Donde _ representa un espacio en blanco. _______ es un tabulador.
//        2. Elimina con dos funciones los espacios en blanco de la cadena:
//        “_ _ _Mi_perro_se_llama_Perico_ _ ______” Donde _ representa un espacio en blanco. _______ es un tabulador.

public class Actividad7 {
    public static void main(String[] args) {
        String cadena1 = "   Mi perro se llama Perico          \t";
        System.out.println("Con espacios" + cadena1);

        String sortCadena1 = cadena1.strip();
        System.out.println("Sin espacios " + sortCadena1);

        String sortCadena2 = cadena1.stripLeading();
        sortCadena2 = sortCadena2.stripTrailing();
        System.out.println("Sin espacios " + sortCadena2);
    }
}
