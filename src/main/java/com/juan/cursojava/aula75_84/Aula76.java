/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula75_84;

/**
 *
 * @author juann
 */
public class Aula76 {
    public static void main(String[] args) {
        String curso = "Curso ";
        String java = "Java";
        
        String cursoJava= curso+java;
        
        String resultado2com2 = "Resultado 2+2 = "+(2+2); //4
        String resultado2com2_ = "Resultado 2+2 = "+2+2; //22
    
        String um = String.valueOf(1); //conversão
        
        String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
                + "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
                + "Purus faucibus ornare suspendisse sed nisi. Cras adipiscing enim eu";
        
        //má-pratica
        String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, ";
        concatenacao2+= "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ";
        concatenacao2+= "Purus faucibus ornare suspendisse sed nisi. Cras adipiscing enim eu";
    }
}
