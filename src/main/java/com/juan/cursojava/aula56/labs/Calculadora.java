/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula56.labs;

/**
 *
 * @author juann
 */
public enum Calculadora {
    SOMA('+') {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y; 
        }
    }, SUBTRACAO('-') {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    }, MULTIPLICACAO('*') {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    }, DIVISAO('/') {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };
    
    private char operador;

    private Calculadora(char operador) {
        this.operador = operador;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public abstract double executarOperacao(double x, double y);
    
    @Override
    public String toString() {
        return ""+operador;
    }
}
