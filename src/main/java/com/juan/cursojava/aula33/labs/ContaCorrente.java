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
public class ContaCorrente {
    private String numero;
    private String agencia;
    private double saldo;
    private boolean especial;
    private double valorEspecialUsado;
    private double limiteEspecial;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String agencia, double saldo, boolean especial, double valorEspecialUsado, double limiteEspecial) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.especial = especial;
        this.valorEspecialUsado = valorEspecialUsado;
        this.limiteEspecial = limiteEspecial;
    }
    
    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }
    
    
    public boolean sacar(double qtdDinheiro) {
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

    public void depositar(double qtdDinheiro) {
        saldo += qtdDinheiro;
    }

    public void consultarSaldo() {
        System.out.println("O saldo atual é: " + this.saldo);
    }

    public boolean verificarChequeEspecial() {
        return saldo<0;
    }
    
    
}
