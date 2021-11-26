/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula36.labs;

import java.util.Scanner;

/**
 *
 * @author juann
 */
public class Ex01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        System.out.println("Digite o nome da Agenda");
        agenda.setNome(scan.next());
        Contato[] amigos = new Contato[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Contato " + (i+1));
            Contato amigo = new Contato();
            System.out.println("Digite o nome do contato");
            amigo.setNome(scan.next());
            System.out.println("Digite o email do contato");
            amigo.setEmail(scan.next());
            System.out.println("Digite o telefone do contato");
            amigo.setTelefone(scan.next());
            
            amigos[i] = amigo;
        }
        agenda.setContatos(amigos);
        
        System.out.println("Informações contato 0");
        agenda.mostrarContato(0);
        System.out.println();
        
        System.out.println("Informações de todos os contatos");
        agenda.mostrarContatos();

    }
}
