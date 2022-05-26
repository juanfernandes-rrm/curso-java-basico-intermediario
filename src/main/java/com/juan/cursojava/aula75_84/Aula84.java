/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula75_84;

import java.util.StringTokenizer;

/**
 *
 * @author juann
 */
public class Aula84 {
    public static void main(String[] args) {
        String doArquivo = "1;Antônio;30;";
        //parametros - string para extrair e delimitador
        StringTokenizer st = new StringTokenizer(doArquivo, ";");
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        
    }
}
