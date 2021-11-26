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
public class ContaEspecial extends ContaBancaria {

    private double limite;

    public ContaEspecial() {
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double saque) {
        if (this.getSaldo() + limite >= saque) {
            setSaldo(getSaldo() - saque);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "ContaEspecial";
        s += "limite" + limite;
        s += super.toString();
        return s;
    }
}
