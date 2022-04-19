package org.example.modelo;

import java.util.Date;

public class CuentaAhorro extends CuentaBase implements Cuenta {
    public CuentaAhorro(String numeroCuenta, Date fechaCreacion, float balance, float interes) {
        super(numeroCuenta, fechaCreacion, balance, interes);
    }


    @Override
    public void retirar(float monto) {
        if (monto >= this.getBalance()) {
            System.out.println("No se puede retirar la suma, su monto es " + getBalance());
        }
        setBalance(getBalance() - monto);
    }
}
