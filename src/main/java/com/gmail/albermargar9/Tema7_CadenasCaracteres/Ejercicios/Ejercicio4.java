package com.gmail.albermargar9.Tema7_CadenasCaracteres.Ejercicios;

//Diseñar una función
//public static boolean iguales(String cadena). que devuelve true si dos cadenas son iguales (misma secuenciade
//caracteres) y false en caso contrario.
//Crea un método main para probar la función.

public class Ejercicio4 {
    public static boolean iguales(String cadena1, String cadena2){
        boolean iguales = false;
        int longitud1 = cadena1.length();
        int longitud2 = cadena2.length();

        if (longitud1==longitud2){
            int i = 0;
            while (i<longitud1 && cadena1.charAt(i) == cadena2.charAt(i)){
                i++;
            }
            if (i==longitud1){
                iguales = true;
            }
        }
        return iguales;
    }

    public static void main(String[] args) {
        System.out.println(iguales("hola", "hola"));
        System.out.println(iguales("hola", "holi"));
        System.out.println(iguales("hola", "hol"));
    }
}
