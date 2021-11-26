/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula43.labs.exer01;

/**
 *
 * @author juann ex01
 */
public class ex01 {

    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaEspecial contaEspecial = new ContaEspecial();

        //Conta bancaria
        System.out.println("--- CONTA SIMPLES ---");
        contaBancaria.setNomeCliente("Cliente conta simples");
        contaBancaria.setNumConta(12345);
        System.out.println(contaBancaria);
        contaBancaria.depositar(100);
        realizarSaque(contaBancaria, 50);
        realizarSaque(contaBancaria, 70);

        //Conta poupanca
        System.out.println("--- CONTA POUPANÇA ---");
        contaPoupanca.setNomeCliente("Cliente 1");
        contaPoupanca.setNumConta(123);
        contaPoupanca.setDiaRendimento(2);
        System.out.println(contaPoupanca);
        contaPoupanca.depositar(100);
        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Novo rendimento aplicado");
            System.out.println("Novo saldo: " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento");
        }

        //Conta especial
        System.out.println("--- CONTA ESPECIAL ---");
        contaEspecial.setNomeCliente("Cliente 1");
        contaEspecial.setNumConta(123);
        contaEspecial.setLimite(50);
        System.out.println(contaEspecial);
        contaEspecial.depositar(100);
        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial, 80);
        System.out.println(contaEspecial);
    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso!;");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
