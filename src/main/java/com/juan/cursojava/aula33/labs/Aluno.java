/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula33.labs;

/**
 *
 * @author juann
 */
public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String[] nomeDisciplinas;
    private double[][] notasDisciplinas;

    public Aluno() {
        nomeDisciplinas = new String[3];
        notasDisciplinas = new double[3][4];
    }

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }
    
    
    
    public boolean verificarAprovado(int indice){
        double soma=0;
        for(int i=0; i<notasDisciplinas[indice].length; i++){
            soma+=notasDisciplinas[indice][i];
        }
        double media= soma / 4;
        System.out.println("MEDIA "+media);
        if(media>=7){
            return true;
        }
        return false;
    }
    
    public void mostrarInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Matrícula "+matricula);
        System.out.println("Curso: "+curso);
        
        for(int i=0;i<notasDisciplinas.length;i++){
            System.out.println("Notas da disciplina "+nomeDisciplinas[i]);
            for(int j=0; j<notasDisciplinas[i].length;j++){
                System.out.print("Nota "+(j+1)+": "+notasDisciplinas[i][j]+"    ");
            }
            System.out.println();
        }
        
    }
    
    public void setNomeDisciplinaPos(int pos, String nomeDisciplina){
        this.nomeDisciplinas[pos] = nomeDisciplina;
    }
    
    public void setNotaPosIJ(int posI, int posJ, double nota){
        this.notasDisciplinas[posI][posJ] = nota;
    }
}
