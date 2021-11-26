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
public class Ex04 {
    //Teste jogo da velha
    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        jogo.preencherTabuleiro();
        jogo.mostrarTabuleiro();
        
        while (!jogo.isFimDeJogo()) {
            if (jogo.getTurno() % 2 != 0) {
                System.out.println("-- Vez do Jogador1 --");
                jogo.setSinal("[X]");
                jogo.jogada();
            } else {
                System.out.println("-- Vez do Jogador2 --");
                jogo.setSinal("[O]");
                jogo.jogada();
            }
            jogo.mostrarTabuleiro();

            jogo.setTurno(jogo.getTurno()+1);
            jogo.setFimDeJogo(jogo.partidaGanha());
        }
    }
}
