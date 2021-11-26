/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula43.labs.exer03;

/**
 *
 * @author juann
 */
public class ex03 {

    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 150, "Amarelo", 2.0, "");
        Peixe tubarao = new Peixe("Tubarão", 300, 1.5);
        Mamifero urso = new Mamifero("Urso-do-Canadá", 180, "Vermelho", 0.5, "Mel");

        System.out.println("ZOO");
        System.out.println("----------------------------------");

        System.out.println("Animal: " + camelo.getNome());
        System.out.println("Comprimento: " + camelo.getComprimento());
        System.out.println("Patas: " + camelo.getPatas());
        System.out.println("Cor: " + camelo.getCor());
        System.out.println("Ambiente: " + camelo.getAmbiente());
        System.out.println("Velocidade: " + camelo.getVelocidade());

        System.out.println("----------------------------------");
        
        System.out.println("Animal: " + tubarao.getNome());
        System.out.println("Comprimento: " + tubarao.getComprimento());
        System.out.println("Patas: " + tubarao.getPatas());
        System.out.println("Cor: " + tubarao.getCor());
        System.out.println("Ambiente: " + tubarao.getAmbiente());
        System.out.println("Velocidade: " + tubarao.getVelocidade());
        System.out.println("Características: " + tubarao.getCaracteristicas());

        System.out.println("----------------------------------");
        
        System.out.println("Animal: " + urso.getNome());
        System.out.println("Comprimento: " + urso.getComprimento());
        System.out.println("Patas: " + urso.getPatas());
        System.out.println("Cor: " + urso.getCor());
        System.out.println("Ambiente: " + urso.getAmbiente());
        System.out.println("Velocidade: " + urso.getVelocidade());
        System.out.println("Alimento: " + urso.getAlimento());
    }
}
