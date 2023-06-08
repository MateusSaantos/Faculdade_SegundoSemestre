/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06_06.classes;

/**
 *
 * @author Mateus
 */
public class FabricaDeSanduichesRT implements SanduichesIngredientFactory {
    @Override
    public PaoIF criarPao() {
        return new Bola();
    }
    @Override
    public QueijoIF criarQueijo() {
        return new Cheddar();
    }
    @Override
    public PresuntoIF criarPresunto() {
        return new Peru();
    }
    @Override
    public SaladaIF criarSalada() {
        return new SemSalada();
    }
}
