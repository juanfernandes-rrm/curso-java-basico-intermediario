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
public class Piramide extends Figura3D {

    private double arestaBase;
    private double arestaLado;
    private double alturaPiramide;
    private double apotemaBase;
    private double apotemaPiramide;
    private Figura2D base;
    private int numPoliBase;

    public Piramide() {
        super.setNome("Pirâmide");
        apotemaBase = arestaBase / 2;
        apotemaPiramide = Math.hypot(apotemaBase, alturaPiramide);
    }

    public Piramide(double arestaBase, double arestaLado, double alturaPiramide) {
        this.arestaBase = arestaBase;
        this.arestaLado = arestaLado;
        this.alturaPiramide = alturaPiramide;
        this.apotemaBase = arestaBase / 2;
        this.apotemaPiramide = Math.hypot(apotemaBase, alturaPiramide);
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getArestaLado() {
        return arestaLado;
    }

    public void setArestaLado(double arestaLado) {
        this.arestaLado = arestaLado;
    }

    public double getAlturaPiramide() {
        return alturaPiramide;
    }

    public void setAlturaPiramide(double alturaPiramide) {
        this.alturaPiramide = alturaPiramide;
    }

    public double getApotemaBase() {
        return apotemaBase;
    }

    public void setApotemaBase(double apotemaBase) {
        this.apotemaBase = apotemaBase;
    }

    public double getApotemaPiramide() {
        return apotemaPiramide;
    }

    public void setApotemaPiramide(double apotemaPiramide) {
        this.apotemaPiramide = apotemaPiramide;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    public int getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    @Override
    public double calcularArea() {
        double areaBase = base.calcularArea();
        if (base != null) {
            double areaLaterais = numPoliBase * (apotemaPiramide * areaBase) / 2;
            double area = areaBase + areaLaterais;
            return area;
        }
        return 0;
    }

    @Override
    public double calcularVolume() {
        double areaBase = base.calcularArea();
        if (base != null) {
            double volume = (areaBase * alturaPiramide) / 3;
            return volume;
        }
        return 0;
    }

}
