/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06_03.classes;

/**
 *
 * @author Mateus
 */
public class FazFormas extends FabricaAbstrataDeFormas{
    
    public Formas FactoryFormas(String forma){
        if(forma.equals("Circulo")){
            return new FormaCirculo();
            
        } else if(forma.equals("Triangulo")){
            return new FormaTriangulo();
            
        } else if(forma.equals("Quadrado")){
            return new FormaQuadrado("Processo de fabricação do quadrado");
            
        } else{
            return new Formas(forma);
        }
    }
}
