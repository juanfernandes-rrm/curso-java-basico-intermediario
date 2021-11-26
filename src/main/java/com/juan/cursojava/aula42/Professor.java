/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula42;

import com.juan.cursojava.aula41.*;

/**
 *
 * @author juann
 */
public class Professor{
    private double salario;
    private String nomeCurso;

    public Professor() {
        super();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    public double calcularSalarioLiquido(){
        return 0;
    }
    
    //Classe Professor (filha de Pessoa)
    public String obterEtiquetaEndereco(){
        String s = "Endereço do professor: ";
        //s+=this.getEndereco();
        
        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do professor: ");
        System.out.println(this.obterEtiquetaEndereco());
    }
}
