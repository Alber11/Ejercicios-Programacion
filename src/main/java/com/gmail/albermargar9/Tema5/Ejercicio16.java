package com.gmail.albermargar9.Tema5;

public class Ejercicio16 {
    public static int multiplicacion(int n, int m){
        int resultado;
        if (n==0){
            resultado = 0;
        }else {
            resultado = n + multiplicacion (n, m-1);
        }
        return resultado;
    }

    public static void main(String[] args) {
        int resultado = multiplicacion(5,2);
        System.out.println(resultado);
    }
}
