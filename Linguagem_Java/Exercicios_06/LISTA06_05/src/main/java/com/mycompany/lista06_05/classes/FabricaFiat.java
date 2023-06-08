/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06_05.classes;

/**
 *
 * @author Mateus
 */
public class FabricaFiat extends FabricaDeCarros{

    @Override
    public CarroSedan criarCarroSedan(){
        return new Siena();
                
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Palio();
    }
}
