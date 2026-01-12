package com.gmail.albermargar9.actividades.actividad12;

import java.util.Scanner;

public class IncrementaHoraIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba una hora: ");
        int hora = sc.nextInt();
        System.out.print("Escriba una minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Escriba una segundos: ");
        int segundos = sc.nextInt();
        boolean verificacionSegundos = segundos >= 0 && segundos <= 59;
        boolean verificacionMinutos = minutos >= 0 && minutos <= 59;
        boolean verificacionHora = hora >= 0 && hora <= 23;
        if (verificacionSegundos) { // 'verificacionSegundos == true' can be simplified to 'verificacionSegundos'
            segundos++;
        }
        if (segundos == 60) {
            minutos++;
            segundos = 0;
        }
        if (minutos == 60) {
            hora++;
            minutos = 0;
        }
        if (hora > 23) {
            hora = 0;
        }
        if (verificacionSegundos && verificacionMinutos && verificacionHora){
            //System.out.println("La hora introducida mas un segundo es: " + hora + " : " +  minutos + " : " + segundos);
            System.out.printf("La hora introducida + 1 segundos es: %02d:%02d:%02d%n", hora, minutos, segundos);
        }
        if (!verificacionSegundos && !verificacionMinutos && !verificacionHora) {
            System.out.println("Todos los datos introducidos son incorrectos");
        }
        if (!verificacionSegundos) {
            System.out.println("Los segundos introducidos son incorrectos");
        }
        if (!verificacionMinutos) {
            System.out.println("Los minutos introducidos son incorrectos");
        }
        if (!verificacionHora) {
            System.out.println("La hora introducida es incorrecta");
        }
    }
}
