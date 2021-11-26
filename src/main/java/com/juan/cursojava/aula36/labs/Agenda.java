/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula36.labs;

/**
 *
 * @author juann
 */
public class Agenda {

    private String nome;
    private Contato contatos[];

    public Agenda() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public void mostrarContato(int num) {
        System.out.println("Nome: " + contatos[num].getNome());
        System.out.println("Email: "+ contatos[num].getEmail());
        System.out.println("Telefone: "+contatos[num].getTelefone());
    }
    
    public void mostrarContatos(){
        for(Contato c:contatos){
            System.out.println(c.getNome());
            System.out.println(c.getEmail());
            System.out.println(c.getTelefone());
            System.out.println();
        }
    }

}
