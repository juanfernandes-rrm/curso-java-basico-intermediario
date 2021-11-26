/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula43.labs.exer01;

import java.util.Calendar;

/**
 *
 * @author juann
 */
public class ContaPoupanca extends ContaBancaria {

    private double diaRendimento;

    public ContaPoupanca() {
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public boolean calcularNovoSaldo(double taxaRendimento) {
        Calendar hoje = Calendar.getInstance();
        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            this.setSaldo(this.getSaldo()+(this.getSaldo()*taxaRendimento));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "ContaPoupanca";
        s += "diaRendimento " + diaRendimento;
        s += super.toString();
        return s;
    }

}
