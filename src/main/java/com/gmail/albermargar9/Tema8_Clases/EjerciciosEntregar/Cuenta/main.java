package com.gmail.albermargar9.Tema8_Clases.EjerciciosEntregar.Cuenta;

import java.util.SortedMap;

public class main {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("012365789548", true, 1000L);

        try {
            System.out.println("Intentando retirar dinero...");
            miCuenta.retirar(50L);

        } catch (CuentaBloqueada e) {
            System.out.println("Excepción capturada: ");
            System.out.println(e.toString());

        } catch (SaldoInsuficiente e) {
            System.out.println("Error: Saldo insuficiente.");
        }
    }
}
