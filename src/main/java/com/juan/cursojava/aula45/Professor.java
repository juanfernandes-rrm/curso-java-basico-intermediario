/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula45;

import com.juan.cursojava.aula40.*;
import com.juan.cursojava.aula38.*;

/**
 *
 * @author juann
 */
public class Professor extends Pessoa{
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
        s+=this.getEndereco();
        
        return s;
    }
}
