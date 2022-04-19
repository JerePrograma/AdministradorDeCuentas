package org.example.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public abstract class CuentaBase {
    private static final long MILISEGUNDOS_EN_30_DIAS = 30 * 24 * 60 * 60 * 1000;
    private String numeroCuenta;
    private Date fechaUltimoInteres;
    private float balance;
    private float interes;

    public void depositar(float monto) {
        this.balance += monto;
    }

    public float getBalance() {
        long ahora = new Date().getTime();
        if (fechaUltimoInteres.getTime() + MILISEGUNDOS_EN_30_DIAS < ahora) {
            int meses = (int) ((ahora - fechaUltimoInteres.getTime()) / MILISEGUNDOS_EN_30_DIAS);
            balance = (float) (balance * Math.pow(1 + interes, meses));
            fechaUltimoInteres.setTime(ahora);
        }
        return balance;
    }
}