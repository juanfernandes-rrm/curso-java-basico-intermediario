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
public class Agenda {

    private static Contato[] contatos;
   

    public Agenda(){
        contatos = new Contato[5];
    }

    public static void adicionarContato(Contato contato) throws AgendaCheiaException {
        boolean cheia = true;
        for(int i=0; i<contatos.length;i++){
            if(contatos[i]==null){
                contatos[i] = contato;
                cheia = false;
                break;
            }
        }
        
        if(cheia){
            throw new AgendaCheiaException();
        }
    }

    public static int consultarContatoPorNome(String nome) throws ContatoNaoExistenteException {
        for(int i=0; i<contatos.length;i++){
            if(contatos[i]!=null){
                if(contatos[i].getNome().equalsIgnoreCase(nome)){
                    return i;
                }
                
            }
            
        }
        //Exception contato nao existe
        throw new ContatoNaoExistenteException(nome);
    }

    @Override
    public String toString() {
        String s = "";
        for(Contato c : contatos){
            if(c != null){
                s+= c.toString() + "\n";
            }
        }    
        return s;
    }
    
    

}
