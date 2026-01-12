package com.gmail.albermargar9.actividades.actividad17;

import java.util.Scanner;

public class MetodoRectanguloHueco6 {
    /**
     * Pintamos triangulo
     * @param base definimos la base del triangulo
     * @param altura definimos la altura del triangulo
     * @param simbolo el simbolo al que se tiene que imprimir el triangulo
     */
    public static void PintarRectangulo(int base, int altura, String simbolo){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print(simbolo + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    /**
     * Pedimos al usuario los parametros
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la base");
        int base = sc.nextInt();
        System.out.println("Escriba la altura");
        int altura = sc.nextInt();
        System.out.println("Escriba el simbolo");
        String simbolo = sc.next();
        PintarRectangulo(base,altura,simbolo);
    }
}
