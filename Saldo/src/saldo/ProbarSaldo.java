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
public class ProbarSaldo {

    /**
     * @param args the command line arguments
     */
    
 
public static void main(String[] args) throws Exception{
       Cuenta c =new Cuenta();
       c.setSaldo(-100);
       c.getSaldo();
}   
}