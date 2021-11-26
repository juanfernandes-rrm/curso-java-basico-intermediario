/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula27.labs;

import java.util.Scanner;

/**
 *
 * @author juann
 */
public class JogoDaVelha {

    String[][] tabuleiro;
    boolean fimDeJogo;
    int turno;
    String sinal;
    
    public JogoDaVelha(){
        tabuleiro = new String[3][3];
        fimDeJogo = false;
        turno = 1;
    }

    void preencherTabuleiro() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = "[ ]";
            }
        }
    }

    void mostrarTabuleiro() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println();
        }
    }

    void jogada() {
        boolean jogadaValida = false;
        
        while (!jogadaValida) {
            int linha = 0;
            int coluna = 0;
            boolean linhaValida = false;
            boolean colunaValida = false;
            Scanner scan = new Scanner(System.in);
            
            while (!linhaValida) {
                System.out.println("Escolha uma linha");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Linha inválida. Escolha a linha 1, 2 ou 3");
                }
            }

            while (!colunaValida) {
                System.out.println("Escolha uma coluna");
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Coluna inválida. Escolha a coluna 1, 2 ou 3");
                }
            }

            linha--;
            coluna--;
            if (tabuleiro[linha][coluna].contentEquals("[ ]")) {
                tabuleiro[linha][coluna] = sinal;
                jogadaValida = true;
            } else {
                System.out.println("Casa ocupada. Escolha outra.");
            }
        }

    }

    boolean partidaGanha() {
        boolean fimPartida = false;

        if (((tabuleiro[0][0].contentEquals("[X]")) && (tabuleiro[0][1].contentEquals("[X]")) && (tabuleiro[0][2]).contentEquals("[X]")) //linha 0
                || ((tabuleiro[1][0].contentEquals("[X]")) && (tabuleiro[1][1].contentEquals("[X]")) && (tabuleiro[1][2]).contentEquals("[X]"))//linha 1
                || ((tabuleiro[2][0].contentEquals("[X]")) && (tabuleiro[2][1].contentEquals("[X]")) && (tabuleiro[2][2]).contentEquals("[X]"))//linha 2
                || ((tabuleiro[0][0].contentEquals("[X]")) && (tabuleiro[1][0].contentEquals("[X]")) && (tabuleiro[2][0]).contentEquals("[X]")) //coluna 0
                || ((tabuleiro[0][1].contentEquals("[X]")) && (tabuleiro[1][1].contentEquals("[X]")) && (tabuleiro[2][1]).contentEquals("[X]")) //coluna 1
                || ((tabuleiro[0][2].contentEquals("[X]")) && (tabuleiro[1][2].contentEquals("[X]")) && (tabuleiro[2][2]).contentEquals("[X]")) //coluna 2
                || ((tabuleiro[0][0].contentEquals("[X]")) && (tabuleiro[1][1].contentEquals("[X]")) && (tabuleiro[2][2].contentEquals("[X]"))) //diagonal principal
                || ((tabuleiro[0][2].contentEquals("[X]")) && (tabuleiro[1][1].contentEquals("[X]")) && (tabuleiro[2][0].contentEquals("[X]"))) //diagonal secundaria 
                ) {
            fimPartida = true;
            System.out.println("----| JOGADOR 1 GANHOU |----");
        } else if (((tabuleiro[0][0].contentEquals("[O]")) && (tabuleiro[0][1].contentEquals("[O]")) && (tabuleiro[0][2]).contentEquals("[O]")) //linha 0
                || ((tabuleiro[1][0].contentEquals("[O]")) && (tabuleiro[1][1].contentEquals("[O]")) && (tabuleiro[1][2]).contentEquals("[O]"))//linha 1
                || ((tabuleiro[2][0].contentEquals("[O]")) && (tabuleiro[2][1].contentEquals("[O]")) && (tabuleiro[2][2]).contentEquals("[O]"))//linha 2
                || ((tabuleiro[0][0].contentEquals("[O]")) && (tabuleiro[1][0].contentEquals("[O]")) && (tabuleiro[2][0]).contentEquals("[O]")) //coluna 0
                || ((tabuleiro[0][1].contentEquals("[O]")) && (tabuleiro[1][1].contentEquals("[O]")) && (tabuleiro[2][1]).contentEquals("[O]")) //coluna 1
                || ((tabuleiro[0][2].contentEquals("[O]")) && (tabuleiro[1][2].contentEquals("[O]")) && (tabuleiro[2][2]).contentEquals("[O]")) //coluna 2
                || ((tabuleiro[0][0].contentEquals("[O]")) && (tabuleiro[1][1].contentEquals("[O]")) && (tabuleiro[2][2].contentEquals("[O]"))) //diagonal principal
                || ((tabuleiro[0][2].contentEquals("[O]")) && (tabuleiro[1][1].contentEquals("[O]")) && (tabuleiro[2][0].contentEquals("[O]"))) //diagonal secundaria 
                ) {
            fimPartida = true;
            System.out.println("----| JOGADOR 2 GANHOU |----");
        } else if (turno > 9) {
            fimPartida = true;
            System.out.println("Ninguém ganhou!");
        }

        return fimPartida;
    }
}
