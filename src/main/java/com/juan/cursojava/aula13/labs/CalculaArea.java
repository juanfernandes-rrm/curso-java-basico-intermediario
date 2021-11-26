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
//ex06 - Programa que calcule a área de um círculo de acordo com o raio inserido
//ex07 - Programa que calcule a área de um quadrado e mostra o dobro da área
public class CalculaArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calcular área de um círculo");
        System.out.println("Digite o raio do círculo: ");
        double raio = scan.nextDouble();
        double area = 3.14*raio*raio;
        System.out.println("A área de círculo com raio "+raio+"u é "+area);
        
        System.out.println();
        System.out.println("Calcular área de um quadrado");
        System.out.println("Digite a medida do lado do quadrado: ");
        double lado = scan.nextDouble();
        System.out.println("A área do quadrado é: "+(lado*lado));
        System.out.println("Dobro da área do quadrado : "+(lado*lado*2));
    }
}
