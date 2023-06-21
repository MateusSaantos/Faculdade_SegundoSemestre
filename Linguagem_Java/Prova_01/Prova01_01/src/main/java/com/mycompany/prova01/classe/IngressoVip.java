/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova01.classe;

/**
 *
 * @author Mateus
 */
public class IngressoVip extends Ingresso{
    private double adicional;
    
    public IngressoVip(){
        
    }
    
    public IngressoVip(double adicional){
        this.adicional = adicional;
    }
    
    public double getAdicional(){
        return adicional;
    }
    
    public void setAdicional(double adicional){
        this.adicional = adicional;
    }
    
    public double valorIngressoVip(){
        double valorIngressoVip;
        
        valorIngressoVip = this.adicional + getValor();
        
        return valorIngressoVip;
    }
}
