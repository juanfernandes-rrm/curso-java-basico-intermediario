/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula43.labs.exer02;

/**
 *
 * @author juann
 */
public class ex02 {
    public static void main(String[] args) {
        PessoaFisica pf1 = new PessoaFisica();
        PessoaFisica pf2 = new PessoaFisica();
        PessoaFisica pf3 = new PessoaFisica();
        
        PessoaJuridica pj1 =new PessoaJuridica(); 
        PessoaJuridica pj2 =new PessoaJuridica(); 
        PessoaJuridica pj3 =new PessoaJuridica(); 
        
        System.out.println("Imposto Pessoa Física");
        
        pf1.setNome("Jorge");
        pf1.setRendaBruta(1200);
        System.out.println("Renda Bruta: "+ pf1.getRendaBruta() +"Imposto : "+pf1.calcularImposto());
    
        pf2.setNome("Pedro");
        pf2.setRendaBruta(1700);
        System.out.println("Renda Bruta: "+ pf2.getRendaBruta() +"Imposto : "+pf2.calcularImposto());
    
        pf3.setNome("Reginaldo");
        pf3.setRendaBruta(4700);
        System.out.println("Renda Bruta: "+ pf3.getRendaBruta() +"Imposto : "+pf3.calcularImposto());
    
        System.out.println();
        System.out.println("---------- // ---------");
        System.out.println();
        System.out.println("Imposto Pessoa Juridica");
        
        pj1.setNome("Ednaldo");
        pj1.setRendaBruta(8000);
        System.out.println("Renda Bruta: "+ pj1.getRendaBruta() +"Imposto : "+pj1.calcularImposto());
        
        pj2.setNome("Ronaldo");
        pj2.setRendaBruta(6200);
        System.out.println("Renda Bruta: "+ pj2.getRendaBruta() +"Imposto : "+pj2.calcularImposto());
        
        pj2.setNome("Evinaldo");
        pj2.setRendaBruta(5300);
        System.out.println("Renda Bruta: "+ pj2.getRendaBruta() +"Imposto : "+pj2.calcularImposto());
    }
}
