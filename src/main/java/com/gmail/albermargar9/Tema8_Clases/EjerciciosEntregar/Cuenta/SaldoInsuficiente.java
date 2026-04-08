package com.gmail.albermargar9.Tema8_Clases.EjerciciosEntregar.Cuenta;

public class SaldoInsuficiente extends Exception {
    public SaldoInsuficiente(String numero, long saldo) {
        super("Saldo insuficiente en la cuenta " + numero + ". Saldo actual: " + saldo);
    }
}
