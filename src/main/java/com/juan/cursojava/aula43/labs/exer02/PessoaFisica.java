/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula43.labs.exer02;

/**
 *
 * @author juann
 */
public class PessoaFisica extends Contribuinte {

    public PessoaFisica() {
    }

    public double calcularImposto() {
        double imposto = 0;
        if (getRendaBruta() > 1400) {
            if (getRendaBruta() <= 2100) {
                imposto = (getRendaBruta() - 100) * 0.1;
            } else if (getRendaBruta() <= 2800) {
                imposto = (getRendaBruta() - 270) * 0.15;
            } else if (getRendaBruta() <= 3600) {
                imposto = (getRendaBruta() - 500) * 0.25;
            } else if (getRendaBruta() > 3600) {
                imposto = (getRendaBruta() - 700) * 0.3;
            }
        }
        return imposto;
    }
}
