/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula33.labs;

/**
 *
 * @author juann
 */
public class Ex02 {
    //Teste contaCorrente
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.setNumero("123456");
        conta.setAgencia("12");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setValorEspecialUsado(0);
        conta.setSaldo(-10);
        
        boolean saqueEfetuado = conta.sacar(10);
        if(saqueEfetuado){
            System.out.println("O saque foi efetuado");
            conta.consultarSaldo();
        }else{
            System.out.println("O saque não foi efetuado. Saldo insuficiente");
            conta.consultarSaldo();
        }
        
        System.out.println("Segunta tentativa");
        saqueEfetuado = conta.sacar(500);
        if(saqueEfetuado){
            System.out.println("O saque foi efetuado.");
            conta.consultarSaldo();
        }else{
            System.out.println("O saque não foi efetuado. Saldo insuficiente");
            conta.consultarSaldo();
        }
        
        System.out.println("Depósito de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();
        
        
        if(conta.verificarChequeEspecial()){
            System.out.println("Está usando o cheque especial.");
        }else{
            System.out.println("Não está usando o cheque especial.");
        }
        
        
        System.out.println("Saque de 600");
        conta.sacar(600);
        conta.consultarSaldo();
        if(conta.verificarChequeEspecial()){
            System.out.println("Está usando o cheque especial.");
        }else{
            System.out.println("Não está usando o cheque especial.");
        }
        
        
    }
}
