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
public class Mamifero extends Animal{
    private String alimento;

    public Mamifero() {
        setAmbiente("terra");
    }

    public Mamifero(String nome, double comprimento, String cor, double velocidade, String alimento) {
        super(nome, comprimento, cor, velocidade);
        this.alimento = alimento;
        setAmbiente("terra");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    
    
    
}
