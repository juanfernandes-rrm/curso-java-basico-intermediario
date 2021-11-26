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
public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno; //upCasting
        Pessoa aluno2 = (Pessoa) new Aluno(); //upCasting
        
        //downCasting
        Pessoa aluno3 = new Pessoa();
        Aluno aluno4 = (Aluno) aluno3; //pode dar erro
        //pq falta informação
        //Pessoa tem nome, endereco, telefone e cpf
        //Aluno tem curso e notas
    }
}
