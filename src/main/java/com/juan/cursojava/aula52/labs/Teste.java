/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula52.labs;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juann
 */
public class Teste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao = 1;

        while (opcao != 3) {
            opcao = obterOpcaoMenu(scan);
            if (opcao == 1) {
                consultarContato(scan, agenda);
            } else if (opcao == 2) {
                adicionarContato(scan, agenda);
            }
        }

    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {

        try {
            System.out.println("Criando um contato");
            String nome = leInformacaoString(scan, "Digite o Nome do contato");
            String telefone = leInformacaoString(scan, "Digite o Telefone do contato");
            String email = leInformacaoString(scan, "Digite o E-mail do contato");
            Contato contato = new Contato(nome, telefone, email);
            System.out.println("Contato a se criado:");
            System.out.println(contato);
            Agenda.adicionarContato(contato);
        } catch (AgendaCheiaException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Contatos da Agenda");
            System.out.println(agenda);
        }
    }

    public static void consultarContato(Scanner scan, Agenda agenda) {
        String nome = leInformacaoString(scan, "Digite o nome do contato a ser pesquisado");
        try {
            if (agenda.consultarContatoPorNome(nome) >= 0) {
                System.out.println("Contato existe");
            }
        } catch (ContatoNaoExistenteException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String leInformacaoString(Scanner scan, String msg) {
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner scan) {
        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {
            System.out.println("Agenda");
            System.out.println("---- Escolha uma opção ----");
            System.out.println("1 - Para consultar contato");
            System.out.println("2 - Para adicionar contato");
            System.out.println("3 - Para sair");

            try {

                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao != 1 || opcao != 2 || opcao != 3) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite novamente\n");
            }
        }
        return opcao;
    }
}
