/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package saldo;

/**
 *
 * @author Universidad
 */
public class Cuenta {
     private float Saldo;

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo)throws SaldoNegativo{
        Validacion.validarSaldo(Saldo);  
        System.out.println("Saldo de $"+ Saldo);
        this.Saldo = Saldo;
    }
}
