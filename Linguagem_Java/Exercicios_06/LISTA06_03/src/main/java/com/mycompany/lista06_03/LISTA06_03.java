/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista06_03;

import com.mycompany.lista06_03.classes.FabricaAbstrataDeFormas;
import com.mycompany.lista06_03.classes.FazFormas;
import com.mycompany.lista06_03.classes.Formas;

/**
 *
 * @author Mateus
 */
public class LISTA06_03 {

    public static void main(String[] args) {
        
        FabricaAbstrataDeFormas geradorFormas = new FazFormas();
        
        Formas minhaForma = geradorFormas.FactoryFormas("Quadrado");
        
        System.out.println("FORMA GERADA: " + minhaForma);
    }
}
