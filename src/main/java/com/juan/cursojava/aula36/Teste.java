/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula36;

/**
 *
 * @author juann
 */
public class Teste {

    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Juan");
        //contato.setEndereco("Rua dos bobos");
        //contato.setTelefone("41 99999-9999");

        //Relacionamento tem-um endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua dos bobos");
        end.setComplemento("");
        end.setCidade("Pinhais");
        end.setEstado("Paraná");
        end.setCep("9999999");
        
        //Relacionamento tem-muitos telefone
        Telefone telefone1 = new Telefone();
        telefone1.setTipo("Celular");
        telefone1.setDdd("41");
        telefone1.setNumero("99999-9999");
        
        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("41");
        telefone2.setNumero("88888-8888");
        
        Telefone[] telefones = new Telefone[2];
        telefones[1] = telefone1;
        telefones[2] = telefone2;
        
        contato.setTelefones(telefones);
        contato.setEndereco(end);
        
        
        System.out.println(contato.getNome());
        //impedindo erro
        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }
        if (contato != null && contato.getTelefones()!= null) {
            for(Telefone tel: contato.getTelefones() ){
                System.out.println(tel.getDdd()+" "+tel.getNumero());
            }
        }
    }
}
