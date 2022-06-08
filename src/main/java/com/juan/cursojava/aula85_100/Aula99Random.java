/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula85_100;

import java.util.Random;

/**
 *
 * @author juann
 */
public class Aula99Random {
    public static void main(String[] args) {
        System.out.println(Math.random()); //0.17492710379402254
        System.out.println(Math.floor(Math.random()*10)); //4.0
        
        Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt(5+1)); //0-5
    }
    
}
