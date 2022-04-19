package org.example.modelo;

import java.util.Date;

public class CuentaCorriente extends CuentaBase implements Cuenta {
    private float maximoSobregiro;

    public CuentaCorriente(String numeroCuenta, Date fechaUltimoInteres, float balance, float interes) {
        super(numeroCuenta, fechaUltimoInteres, balance, interes);
    }

    @Override
    public void retirar(float monto) {
        if (monto >= (this.getBalance() + maximoSobregiro)) {
            System.out.println("No se puede retirar la suma, su monto es " + getBalance());
        }
        setBalance(getBalance() - monto);
    }
}
