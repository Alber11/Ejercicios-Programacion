package com.gmail.albermargar9.Tema5;

public class Ejercicio16_v2 {
    public static int multiplicacion(int n, int m){
        int resultado = 0;
        for (int i = 1; i <=m ; i++) {
            resultado+=n;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(multiplicacion(4,5));
    }
}
