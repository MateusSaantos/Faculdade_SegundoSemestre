/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06_04.classes;

/**
 *
 * @author Mateus
 */
public class LanchoneteJP extends Sanduiche{
    
    private String processoProducao;
    
    public LanchoneteJP(String processoProducao){
        super("Pao Frances", "Queijo Mussarela", "Presunto de Frango", "Com verdura");
        this.processoProducao = processoProducao;
    }
}
