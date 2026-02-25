package com.gmail.albermargar9.Tema7_CadenasCaracteres.Ejercicios;

//Diseñar una función
//public static boolean igualesExtendido(String cadena). que devuelve true si dos cadenas son iguales (misma secuencia de
//        caracteres) y false en caso contrario. No tienen en cuenta mayúsculas ni minúsculas.
//Crea un método main para probar la función.

public class Ejercicio5 {
    public static boolean igualesExtendido(String cadena1, String cadena2){
        int longitud1 = cadena1.length();
        int longitud2 = cadena2.length();
        boolean iguales = false;

        if (longitud1==longitud2){
            int i = 0;
            while (i<longitud1 && Character.toLowerCase(cadena1.charAt(i)) == Character.toLowerCase(cadena2.charAt(i))){
                i++;
            }
            if (i==longitud1){
                iguales = true;
            }
        }

        return iguales;
    }

    public static void main(String[] args) {
        System.out.println(igualesExtendido("HOLA", "hola"));
        System.out.println(igualesExtendido("hola", "holi"));
        System.out.println(igualesExtendido("hola", "hol"));
    }
}
