/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06_06.classes;

/**
 *
 * @author Mateus
 */
public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory {

    @Override
    public PaoIF criarPao() {
        return new Integral();
    }
    @Override
    public QueijoIF criarQueijo() {
        return new Prato();
    }
    @Override
    public PresuntoIF criarPresunto() {
        return new Frango();
    }
    @Override
    public SaladaIF criarSalada() {
        return new SemSalada();
    }
}
