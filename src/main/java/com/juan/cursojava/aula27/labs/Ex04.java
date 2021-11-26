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
public class Ex04 {
    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        jogo.preencherTabuleiro();
        jogo.mostrarTabuleiro();
        
        while (!jogo.fimDeJogo) {
            if (jogo.turno % 2 != 0) {
                System.out.println("-- Vez do Jogador1 --");
                jogo.sinal = "[X]";
                jogo.jogada();
            } else {
                System.out.println("-- Vez do Jogador2 --");
                jogo.sinal = "[O]";
                jogo.jogada();
            }
            jogo.mostrarTabuleiro();

            jogo.turno++;
            jogo.fimDeJogo = jogo.partidaGanha();
        }
    }
}
