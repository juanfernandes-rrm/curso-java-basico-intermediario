/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula10;

/**
 *
 * @author juann
 */
public class Variaveis {
    public static void main(String[] args) {
        
        //convenção Java
        int idade = 19;
        String nome = "Juan Fernandes";
        String nomeDoMeuCachorro = "Jujuba";
        
        idade = 20;
        
        //aceito, mas não utilizado
        int _idade;
        int $idade;
        
        //não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        
        //má prática
        //sem significado
        int a = 10;
        String b = "Juan";
        
        
        System.out.println("Idade = "+idade);
        System.out.println("Nome = "+nome);
        System.out.println("Nome do meu cachorro = "+nomeDoMeuCachorro);
    }
}
