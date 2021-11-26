/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula27.labs;

import java.util.Scanner;

/**
 *
 * @author juann
 */
//ex003
public class Ex03 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        aluno.nome = scan.next();
        System.out.println("Digite o curso do aluno");
        aluno.curso = scan.next();
        System.out.println("Digite a matrícula do aluno");
        aluno.matricula = scan.next();
        for(int i=0; i<aluno.nomeDisciplinas.length;i++){
            System.out.println("Digite o nome da Disciplina "+i);
            aluno.nomeDisciplinas[i] = scan.next();
        }

        for(int i=0; i<aluno.notasDisciplinas.length; i++){
            System.out.println("Obtendo notas da disciplina "+aluno.nomeDisciplinas[i]);
            for(int j=0; j<aluno.notasDisciplinas[i].length;j++){
                System.out.println("Nota "+(j+1)+"da disciplina "+ (i+1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }
        
        aluno.mostrarInfo();
        
        for(int i=0; i<aluno.nomeDisciplinas.length;i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Disciplina "+aluno.nomeDisciplinas[i]+" - Aprovado");
            }else{
                System.out.println("Disciplina "+aluno.nomeDisciplinas[i]+" - Reprovado");
            
            }   
        }
    }
}
