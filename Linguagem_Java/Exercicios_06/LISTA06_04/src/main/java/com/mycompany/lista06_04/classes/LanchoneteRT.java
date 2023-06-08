/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06_04.classes;

/**
 *
 * @author Mateus
 */
public class LanchoneteRT extends Sanduiche{
    
    private String processoProducao;
    
    public LanchoneteRT(String processoProducao){
        super("Pao Bola", "Queijo Cheddar", "Presunto de Peru", "Sem verdura");
        this.processoProducao = processoProducao;
    }
    
}
