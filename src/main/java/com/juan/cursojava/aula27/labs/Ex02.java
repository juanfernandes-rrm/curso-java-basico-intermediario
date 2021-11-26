/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula27.labs;

/**
 *
 * @author juann
 */
public class Ex02 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numero="123456";
        conta.agencia="12";
        conta.especial=true;
        conta.limiteEspecial=500;
        conta.valorEspecialUsado=0;
        conta.saldo= -10;
        
        
        boolean saqueEfetuado = conta.sacar(10);
        conta.consultarSaldo();
        
        if(saqueEfetuado){
            System.out.println("O saque foi efetuado");
            System.out.println("Saldo atual: "+conta.saldo);
        }else{
            System.out.println("O saque não foi efetuado. Saldo insuficiente");
            System.out.println("Saldo atual: "+conta.saldo);
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
