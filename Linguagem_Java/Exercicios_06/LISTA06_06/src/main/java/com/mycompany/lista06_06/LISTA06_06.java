/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista06_06;

import com.mycompany.lista06_06.classes.Sanduiche;
import com.mycompany.lista06_06.classes.SanduichesIngredientFactory;
import com.mycompany.lista06_06.classes.SanduichesIngredientFactoryCG;
import com.mycompany.lista06_06.classes.SanduichesIngredientFactoryJP;

/**
 *
 * @author Mateus
 */
public class LISTA06_06 {

    public static void main(String[] args) {

        SanduichesIngredientFactory fabricaCG = new SanduichesIngredientFactoryCG();
    
        Sanduiche sanduicheCG = new Sanduiche(fabricaCG.criarPao().pao(), fabricaCG.criarQueijo().queijo(), fabricaCG.criarPresunto().presunto(), fabricaCG.criarSalada().salada());
        sanduicheCG.ImprimirSanduiche();
        
        SanduichesIngredientFactory fabricaJP = new SanduichesIngredientFactoryJP();
    
        Sanduiche sanduicheJP = new Sanduiche(fabricaJP.criarPao().pao(), fabricaJP.criarQueijo().queijo(), fabricaJP.criarPresunto().presunto(), fabricaJP.criarSalada().salada());
        sanduicheJP.ImprimirSanduiche();
          
    }
}
