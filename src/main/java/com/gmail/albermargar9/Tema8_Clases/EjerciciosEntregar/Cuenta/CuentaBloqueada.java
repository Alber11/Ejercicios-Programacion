package com.gmail.albermargar9.Tema8_Clases.EjerciciosEntregar.Cuenta;

public class CuentaBloqueada extends Exception {

    private String numeroCuenta;

    public CuentaBloqueada(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {

        return "La cuenta " + numeroCuenta + " está bloqueada";
    }
}
