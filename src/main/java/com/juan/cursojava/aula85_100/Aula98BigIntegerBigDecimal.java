/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula85_100;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author juann
 */
public class Aula98BigIntegerBigDecimal {
    public static void main(String[] args) {
        double a = 0.03;
        double b = 0.04;
        double c = b-a;
        System.out.println(c); //0.010000000000000002
     
        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.04");
        BigDecimal _c = _b.subtract(_a);
        System.out.println(_c); //0.01
        
        BigDecimal bd1 = new BigDecimal("1234567890.0987654321");
        BigDecimal bd2 = new BigDecimal("987654321.9876543210");
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(new BigDecimal(2)));
        
        BigInteger bi = new BigInteger("1000000000000");
        System.out.println(bi);
    }
}
