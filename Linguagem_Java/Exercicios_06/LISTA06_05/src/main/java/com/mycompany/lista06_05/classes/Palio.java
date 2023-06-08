/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06_05.classes;

/**
 *
 * @author Mateus
 */
public class Palio extends CarroPopular{
    
    /*
    public Palio() {
        super("Palio");
    }
    */

    @Override
    public void informacoesCarroPopular(String processoFabricacao){
        System.out.println("========= FABRICAÇÃO CARRO =========");
        System.out.println("MODELO: PALIO");
        System.out.println("FABRICAÇÃO: " + processoFabricacao);
        
    }
}
