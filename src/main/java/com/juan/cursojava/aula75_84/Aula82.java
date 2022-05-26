/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula75_84;

/**
 *
 * @author juann
 */
public class Aula82 {
    public static void main(String[] args) {
        //join - juntar string com um separador
        String alfabeto = String.join(", ","A","B","C","D");
        System.out.println(alfabeto);
        
        //split - separar string apartir de um separador
        String[] letras = alfabeto.split(", ");
        for(String letra: letras){
            System.out.println(letra);
        }
        
        String doArquivo = "1;Antônio;30;";
        String[] infos = doArquivo.split(";");
        for(String info: infos){
            System.out.println(info);
        }
        Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), 
                infos[1],Integer.parseInt(infos[2]));
        System.out.println(pessoa);
    }
}
