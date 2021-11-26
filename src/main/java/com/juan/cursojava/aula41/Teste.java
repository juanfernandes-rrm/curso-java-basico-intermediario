/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula41;

/**
 *
 * @author juann
 */
public class Teste {
    public static void main(String[] args) {
        //Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        
        //pessoa.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2, num2");
        professor.setEndereco("Rua 3, num3");
        
        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
    }
}
