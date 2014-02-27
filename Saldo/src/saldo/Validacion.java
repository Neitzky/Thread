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
public class Validacion {
    public static void validarSaldo(float Saldo) throws SaldoNegativo {
     if (Saldo < 0 )throw new SaldoNegativo();
    }
    
}
