/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula12;

import java.util.Scanner;

/**
 *
 * @author juann
 */
public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome completo : ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: "+nomeCompleto);
        
        //lendo tipo especifico
        System.out.println("Digite seu primeiro nome : ");
        String primeiroNome = scan.nextLine();
        System.out.println("Seu primeiro nome é: "+primeiroNome);
        
        //lendo un inteiro
        System.out.println("Digite a sua idade");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: "+idade);
        
        //ponto flutuante
        System.out.println("Digite a sua altura");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: "+altura);
        
        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, \n"
                + "altura e se tem bichinho de estimação: ");
        primeiroNome = scan.next();
        idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        altura = scan.nextDouble();
        boolean temPet = scan.nextBoolean();
        
        System.out.println("Você digitou os seguinte valores :");
        System.out.println("Primeiro nome :"+primeiroNome);
        System.out.println("Idade :"+idade);
        System.out.println("Quantidade de filhos :"+qtdFilhos);
        System.out.println("Altura :"+altura);
        System.out.println("Tem animal de estimação? "+temPet);
    }
}
