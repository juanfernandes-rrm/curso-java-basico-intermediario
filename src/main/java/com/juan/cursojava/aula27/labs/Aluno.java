/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula27.labs;

/**
 *
 * @author juann
 */

//ex003
public class Aluno {
    String nome;
    String matricula;
    String curso;
    String[] nomeDisciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4];
        
    boolean verificarAprovado(int indice){
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
    
    void mostrarInfo(){
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
    
}
