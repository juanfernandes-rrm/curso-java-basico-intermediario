/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula43.labs.exer01;

/**
 *
 * @author juann
 */
public class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean sacar(double saque){
        if(this.saldo >= saque){
            saldo -= saque;
            return true;
        }else{
            return false;    
        }
    }
    
    public void depositar(double quantia){
        saldo += quantia;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + '}';
    }
    
    
}
