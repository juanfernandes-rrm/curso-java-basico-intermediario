/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula36.labs;

/**
 *
 * @author juann
 */
public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public Curso() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void mostrarMedias() {
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Nota Média do aluno " + alunos[i].getNome());
            double media = (alunos[i].getNotas()[0] + alunos[i].getNotas()[1] + alunos[i].getNotas()[2] + alunos[i].getNotas()[3]) / 4;
            if (media >= 7) {
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Aluno reprovado");
            }
            System.out.println("Nota: " + media);
        }
    }
    
    public double mediaTurma(){
        double media=0;
        for(Aluno aluno: alunos){
            for(double nota: aluno.getNotas()){
                media+=nota;
            }
        }
        return media/(alunos.length*4);
    }
}
