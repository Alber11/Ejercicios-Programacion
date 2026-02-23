package com.gmail.albermargar9.Actividades_Temas1_4.actividad16;

import java.util.Scanner;

public class BucleForImput3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dame un numero");
        int num = sc.nextInt();
        for (int i = 0; num>i; i++){ //(int i = num; num>0; num--)
            for (int n = 1; n < 6; n++){
                System.out.print(n);
            }
        }
    }
}
