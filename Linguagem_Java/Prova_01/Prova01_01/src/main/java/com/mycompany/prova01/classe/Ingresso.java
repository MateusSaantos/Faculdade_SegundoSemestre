/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova01.classe;

/**
 *
 * @author Mateus
 */
public class Ingresso {

    private double valor;
    
    public Ingresso(){
        
    }
    
    public Ingresso(double valor){
        this.valor = valor;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public void imprimeValor(){
        System.out.println("VALOR DO INGRESSO: " + this.valor);
    }
}
