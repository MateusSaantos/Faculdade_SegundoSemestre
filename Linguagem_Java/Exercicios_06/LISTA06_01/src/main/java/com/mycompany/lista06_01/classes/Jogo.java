/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06_01.classes;

/**
 *
 * @author Mateus
 */
public class Jogo {
    
    public static Jogo inicio;
    
    private String visitante;
    private String casa;
    
    private Jogo(){
        
    }
    
    public static Jogo inicioJogo(){
        if(inicio == null){
            inicio = new Jogo();
        }
        return inicio;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }
}
