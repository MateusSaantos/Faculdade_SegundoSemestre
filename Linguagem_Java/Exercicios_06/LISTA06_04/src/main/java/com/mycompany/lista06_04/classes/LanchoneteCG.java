/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06_04.classes;

/**
 *
 * @author Mateus
 */
public class LanchoneteCG extends Sanduiche{
    
    private String processoProducao;
    
    public LanchoneteCG(String processoProducao){
        super("Pao Integral", "Queijo Prato", "Presunto de Frango", "Sem verdura");
        this.processoProducao = processoProducao;
    }
    
}
