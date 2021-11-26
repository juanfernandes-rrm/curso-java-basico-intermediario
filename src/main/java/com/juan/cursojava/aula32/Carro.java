/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula32;

/**
 *
 * @author juann
 */
public class Carro {

    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    
    //Encapsulamento, métodos set e get
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getNumPassageiros(){
        return this.numPassageiros;
    }
    
    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros = numPassageiros;
    }
    
    public double getCapCombustivel(){
        return this.capCombustivel;
    }
    
    public void setCapCombustivel(double capCombustivel){
        this.capCombustivel = capCombustivel;
    }
    
    public double getConsumoCombustivel(){
        return this.consumoCombustivel;
    }
    
    public void setConsumoCombustivel(double consumoCombustivel){
        this.consumoCombustivel = consumoCombustivel;
    }
}
