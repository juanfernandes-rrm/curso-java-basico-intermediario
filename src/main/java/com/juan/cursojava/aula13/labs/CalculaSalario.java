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
//ex08 - Programa que pede o ganho por hora e quantidade de horas trabalhadas
//no mês
//ex13 - Calcula salário com desconto do Imposto de Renda(11%), INSS(8%), Sindicato(5%)
//e mostre quanto custou cada desconto
public class CalculaSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o ganho por hora: ");
        double ganhoHora = scan.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horaMes = scan.nextDouble();
        
        double salarioBruto = ganhoHora*horaMes;
        System.out.println("O salário bruto por mês é "+salarioBruto);
        
        double impRenda = salarioBruto*0.11;
        double inss = salarioBruto*0.08;
        double sindicato = salarioBruto*0.05;
        double salarioLiquido = salarioBruto - impRenda - inss - sindicato;
        
        System.out.println("Sálario Líquido = Sálario Bruto R$"+salarioBruto
                + " - Imposto de Renda (11%) R$"+impRenda+" - INSS (8%) R$"+inss+" - Sindicato (5%) R$"+sindicato);
        System.out.println("Sálario Líquido = R$"+salarioLiquido);
        
        
        
    }
}
