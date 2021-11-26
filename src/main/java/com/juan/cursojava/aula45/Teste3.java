/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula45;

/**
 *
 * @author juann
 */
public class Teste3 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        
        if(pessoa instanceof Pessoa){
            System.out.println("É do tipo Pessoa");
        }
        
        if(aluno instanceof Aluno){
            System.out.println("É do tipo Aluno");
        }
        
        if(professor instanceof Professor){
            System.out.println("É do tipo Professor");
        }
    }
}
