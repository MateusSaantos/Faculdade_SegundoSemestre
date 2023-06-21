/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova1_04.classe;

/**
 *
 * @author Mateus
 */
public class Quadrado implements FormaGeometrica{
    
    private double base;
    private double altura;
    
    public Quadrado(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double area(){
        double resp;
        resp = this.base * this.altura;
        return resp;
    }
    
    public double comprimento(){
        double resp;
        resp = this.base + this.base + this.altura + this.altura;  
        return resp;
    }
}
