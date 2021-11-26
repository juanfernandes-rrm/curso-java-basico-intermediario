/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author juann
 */

//ex14 - Programa que calcula o tempo de download de um arquivo em MB
// de acordo com a velocidade de download em Mbps
public class CalculaDownload {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho do arquivo (MB) : ");
        double tamanho = scan.nextDouble();
        
        System.out.println("Digite a velocidade da internet (Mbps) : ");
        double velocidade = scan.nextDouble();
        
        double download = tamanho/(velocidade/8);
        
        System.out.println("O tempo de download é "+download/60+" minutos");
    }
}
