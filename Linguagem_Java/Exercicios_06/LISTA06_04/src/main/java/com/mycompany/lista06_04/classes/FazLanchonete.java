/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06_04.classes;

/**
 *
 * @author Mateus
 */
public class FazLanchonete extends FabricaAbstrataDeLanchonetes{
    
    @Override
    public Sanduiche FactoryLanchonete(String forma){
        if(forma.equals("LanchoneteCG")){
            return new LanchoneteCG("PROCESSO DE PRODUÇÃO LANCHONETE CG");
            
        } else if(forma.equals("LanchoneteJP")){
            return new LanchoneteCG("PROCESSO DE PRODUÇÃO LANCHONETE CG");
            
        } else if(forma.equals("LanchoneteRT")){
            return new LanchoneteCG("PROCESSO DE PRODUÇÃO LANCHONETE CG");

        } else{
            return new Sanduiche("", "", "", "");
        }
    }
}
