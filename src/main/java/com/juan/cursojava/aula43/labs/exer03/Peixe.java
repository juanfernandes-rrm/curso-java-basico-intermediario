/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula43.labs.exer03;

/**
 *
 * @author juann
 */
public class Peixe extends Animal{
    private String caracteristicas;
    
    public Peixe(){
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristicas = "barbatanas e cauda";
    }
    
    public Peixe(String nome, double comprimento, double velocidade) {
        super(nome, comprimento, velocidade);
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristicas = "barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    
    
    
    
    
}
