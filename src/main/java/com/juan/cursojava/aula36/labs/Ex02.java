/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula36.labs;

import java.util.Scanner;

/**
 *
 * @author juann
 */
public class Ex02 {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setNome("ADS");
        curso.setHorario("18:30 - 22:00");

        Professor professor = new Professor();
        professor.setNome("Augusto");
        professor.setDepartamento("Ciências");
        professor.setEmail("augusto@gmail.com");
        curso.setProfessor(professor);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("joão");
        aluno1.setMatricula("001");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("mateus");
        aluno2.setMatricula("002");

        Aluno[] alunos = new Aluno[2];
        alunos[0] = aluno1;
        alunos[1] = aluno2;
        
        curso.setAlunos(alunos);
        
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < curso.getAlunos().length; i++) {
            double[] notas = new double[4];
            System.out.println("Aluno " + curso.getAlunos()[i].getNome());
            System.out.println("Digite a nota " + 1);
            notas[0] = scan.nextDouble();
            System.out.println("Digite a nota " + 2);
            notas[1] = scan.nextDouble();
            System.out.println("Digite a nota " + 3);
            notas[2] = scan.nextDouble();
            System.out.println("Digite a nota " + 4);
            notas[3] = scan.nextDouble();
            curso.getAlunos()[i].setNotas(notas);
        }
        
        curso.mostrarMedias();
        System.out.println("A média da turma é: "+curso.mediaTurma());
    }
}
