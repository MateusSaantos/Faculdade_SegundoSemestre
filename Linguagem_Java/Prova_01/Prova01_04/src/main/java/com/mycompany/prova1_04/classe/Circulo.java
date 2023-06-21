/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova1_04.classe;

/**
 *
 * @author Mateus
 */
public class Circulo implements FormaGeometrica{
    
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    public double area(){
        double resp;
        
        resp = 3.14 * (this.raio * this.raio);
        
        return resp;
    }
    
    public double comprimento(){
        double resp;
        
        resp = 2 * 3.14 * this.raio;
        
        return resp;
    }
}
