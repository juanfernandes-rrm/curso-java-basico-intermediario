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
//ex002
public class ContaCorrente {

    String numero;
    String agencia;
    double saldo;
    boolean especial;
    double valorEspecialUsado;
    double limiteEspecial;

    boolean sacar(double qtdDinheiro) {
        if (qtdDinheiro <= this.saldo) {
            this.saldo -= qtdDinheiro;
            return true;
        } else {
            if (especial) {
                double limite = limiteEspecial + saldo;
                if(limite >= qtdDinheiro){
                    saldo-=qtdDinheiro;
                    return true;
                }else{
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    void depositar(double qtdDinheiro) {
        saldo += qtdDinheiro;
    }

    void consultarSaldo() {
        System.out.println("O saldo atual é: " + this.saldo);
    }

    boolean verificarChequeEspecial() {
        return saldo<0;
    }
}
