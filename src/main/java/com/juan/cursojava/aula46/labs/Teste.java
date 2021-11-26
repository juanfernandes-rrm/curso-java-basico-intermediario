/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula46.labs;

/**
 *
 * @author juann
 */
public class Teste {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        
        Quadrado quadrado = new Quadrado();
        quadrado.setLado(2);
        
        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(2);
        triangulo.setBase(3);
        
        
        Cubo cubo = new Cubo();
        cubo.setAresta(3);
        
        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(3);
        cilindro.setRaioBase(2);
        
        Piramide piramide = new Piramide();
        piramide.setApotemaPiramide(4);
        piramide.setAlturaPiramide(3);
        piramide.setArestaBase(2);
        piramide.setNumPoliBase(4);
        piramide.setBase(quadrado); 
        
        FiguraGeometrica[] figurasGeom = {circulo,quadrado,triangulo,cubo,cilindro,piramide};
        
        for(FiguraGeometrica figura:figurasGeom){
            if(figura instanceof Figura3D){
                System.out.println(figura.getNome());
                Figura3D figura3D = (Figura3D) figura; //DownCast
                System.out.println("Área = "+figura3D.calcularArea());
                System.out.println("Volume = "+figura3D.calcularVolume());
            }else{
                System.out.println(figura.getNome());
                Figura2D figura2D = (Figura2D) figura; //DownCast 
                System.out.println("Área = "+figura2D.calcularArea());
            }
        }
    }
}
