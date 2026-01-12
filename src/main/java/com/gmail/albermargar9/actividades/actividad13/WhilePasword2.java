package com.gmail.albermargar9.actividades.actividad13;

import java.util.Scanner;

public class WhilePasword2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crea una contraseña numerica: ");
        final int pasword = sc.nextInt();
        System.out.println("escriba su contraseña: ");
        int pass_typed = sc.nextInt();
        while (pass_typed != pasword){
            System.out.println("contraseña introducida es invalida");
            System.out.println("vuelva a introducir la contraseña: ");
            pass_typed = sc.nextInt();
        }
        System.out.println("contraseña correcta");
        //se continua con la ejecucion ya que si se ha introducido la contraseña correcta


    }
}
