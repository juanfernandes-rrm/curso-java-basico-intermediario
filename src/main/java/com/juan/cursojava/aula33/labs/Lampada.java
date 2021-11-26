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
public class Lampada {

    private String tipo;
    private String tensao;
    private int potencia;
    private String cor;
    private double durabilidade;
    private int garantiaMeses;
    private boolean ligada;

    public Lampada() {
        ligada = false;
    }

    public Lampada(String tipo, String tensao, int potencia, String cor, double durabilidade, int garantiaMeses, boolean ligada) {
        this.tipo = tipo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.durabilidade = durabilidade;
        this.garantiaMeses = garantiaMeses;
        this.ligada = ligada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(double durabilidade) {
        this.durabilidade = durabilidade;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    
    

    private void ligarLampada() {
        setLigada(true);
    }

    private void desligarLampada() {
        setLigada(false);
    }

    public void mudarEstado() {
        if (!ligada) {
            setLigada(true);
        } else {
            setLigada(false);
        }
    }

    public void verificarLampada() {
        if (ligada) {
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpada está desligada");
        }
    }

}
