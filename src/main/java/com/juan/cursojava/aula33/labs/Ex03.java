/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula33.labs;

import java.util.Scanner;

/**
 *
 * @author juann
 */
public class Ex03 {
    //Teste aluno
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno");
        aluno.setNome(scan.next());
        System.out.println("Digite o curso do aluno");
        aluno.setCurso(scan.next());
        System.out.println("Digite a matrícula do aluno");
        aluno.setMatricula(scan.next());
        for(int i=0; i<aluno.getNomeDisciplinas().length;i++){
            System.out.println("Digite o nome da Disciplina "+(i+1));
            aluno.setNomeDisciplinaPos(i, scan.next());
        }
        
        for(int i=0; i<aluno.getNotasDisciplinas().length; i++){
            System.out.println("Obtendo notas da disciplina "+aluno.getNomeDisciplinas()[i]);
            for(int j=0; j<aluno.getNotasDisciplinas()[i].length;j++){
                System.out.println("Nota "+(j+1)+"da disciplina "+ (i+1));
                aluno.setNotaPosIJ(i, j, scan.nextDouble());
            }
        }
        
        aluno.mostrarInfo();
        
        for(int i=0; i<aluno.getNomeDisciplinas().length;i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Disciplina "+aluno.getNomeDisciplinas()[i]+" - Aprovado");
            }else{
                System.out.println("Disciplina "+aluno.getNomeDisciplinas()[i]+" - Reprovado");
            }   
        }
        
    }
}
