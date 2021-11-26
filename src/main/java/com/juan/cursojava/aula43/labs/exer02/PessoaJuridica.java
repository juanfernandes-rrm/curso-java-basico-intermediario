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
public class PessoaJuridica extends Contribuinte{

    public PessoaJuridica() {
    }
    
    public double calcularImposto(){
        double imposto = this.getRendaBruta() * 0.1;
        return imposto;
    }
}
