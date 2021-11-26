/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula14;

import java.util.Scanner;

/**
 *
 * @author juann
 */
public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Diigite a idade: ");
        int idade = scan.nextInt();
        
        if(idade >= 18){
            System.out.println("É maior de idade.");
        }else{
            System.out.println("Não é maior de idade.");
        }
        
        System.out.println("Digite o preço do item");
        double valor = scan.nextDouble();
        if(valor<=10){
            System.out.println("Está barato, pode comprar");
        }else if(10<valor && valor <15){
            System.out.println("Pode pedir desconto");
        }else if(valor >=15 && valor<17){
            System.out.println("Pesquisar mais");
        }else{ //valor>=17
            System.out.println("Muito caro");
        }
        
    }
}
