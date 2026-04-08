package com.gmail.albermargar9.Tema8_Clases.EjerciciosEntregar.Cuenta;

public class CuentaBancaria {
    String numero;
    boolean bloqueada;
    long saldo;

    CuentaBancaria(String numero, boolean bloqueada, long saldo){
        this.numero = numero;
        this.bloqueada = bloqueada;
        this.saldo = saldo;
    }

    void retirar (Long cantidad) throws  SaldoInsuficiente, CuentaBloqueada{
        if (bloqueada){
            throw new CuentaBloqueada(numero);
        } else if (cantidad > saldo) {
            throw new SaldoInsuficiente(numero, saldo);
        } else {
            saldo -= cantidad;
        }
    }
}
