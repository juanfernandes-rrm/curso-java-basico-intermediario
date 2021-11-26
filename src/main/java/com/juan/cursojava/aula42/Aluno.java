/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula42;


/**
 *
 * @author juann
 */
public class Aluno{
    private String curso;
    private double[] notas;

    public Aluno() {
        super(); //chama o construtor da super Classe
    }

    //chama outro construtor da super Classe 
    public Aluno(String nome, String endereco, String telefone, String curso) {
        //super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double calcularMedia(){
        return 0;
    }
    
    public boolean retornarAprovado(){
        return true;
    }
    
    //Classe Aluno (filha de Pessoa)
    public String obterEtiquetaEndereco(){
        String s = "Endereço do aluno: ";
        //s+=this.getEndereco();
        
        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }
}
