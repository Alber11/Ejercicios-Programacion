package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

//Crea la tabla {1, 4, 8, 9, 12} y utiliza un bucle for para recorrer la tabla e ir
//mostrando cada elemento por pantalla. Los podéis mostrar en fila o en columna.
//Transforma el código después en una función
//public static void mostrar(int tabla t)
//e invócala desde el main.
//Ejemplo de ejecución:
//        1 4 8 9 12

public class Ejercicio2 {
    public static void mostrar(int [] tabla){
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }
        //recoremos la tabla con el bucle for y cada instruccion del for nos dice en que posicion de la tabla está
    }

    public static void main(String[] args) {
        int [] tabla = {1, 4, 8, 9, 12};
        mostrar(tabla);
    }
}
