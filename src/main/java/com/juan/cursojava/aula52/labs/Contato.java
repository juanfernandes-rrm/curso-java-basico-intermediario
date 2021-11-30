/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula52.labs;

/**
 *
 * @author juann
 */
public class Contato {
    private int id = 0;
    private String nome;
    private String telefone;
    private String email;
    
    private static int contador;

    public Contato() {
        this.contador++;
        this.id = contador;
    }
    
    public Contato(String nome, String telefone, String email) {
        this.contador++;
        this.id = contador;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", telefone=" + telefone +" email="+email+", identificador=" + id + '}';
    }
    
}
