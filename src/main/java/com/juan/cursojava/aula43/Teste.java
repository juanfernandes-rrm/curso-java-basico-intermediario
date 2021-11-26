/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula43;

/**
 *
 * @author juann
 */
public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setCurso("Análise e desenvolvimento de Sistemas");
        double[] notas = {6,8,7,10};
        aluno.setNotas(notas);
        
        System.out.println(aluno.toString());
    }
}
