/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author juann
 */
public class Aula95ResourceBundle {
    public static void main(String[] args) {
        System.out.println("Locale atual "+Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
    }
}
