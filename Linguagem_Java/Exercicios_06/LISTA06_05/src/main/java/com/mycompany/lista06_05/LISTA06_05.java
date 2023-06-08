/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista06_05;

import com.mycompany.lista06_05.classes.CarroPopular;
import com.mycompany.lista06_05.classes.CarroSedan;
import com.mycompany.lista06_05.classes.FabricaDeCarros;
import com.mycompany.lista06_05.classes.FabricaFiat;
import com.mycompany.lista06_05.classes.FabricaFord;

/**
 *
 * @author Mateus
 */
public class LISTA06_05 {

    public static void main(String[] args) {
        System.out.println("FABRICA DE CARROS");
        
        FabricaDeCarros fiat = new FabricaFiat();
        CarroPopular popular = fiat.criarCarroPopular();
        popular.informacoesCarroPopular("Fabricação FIAT");
                
        FabricaDeCarros ford = new FabricaFord();
        CarroSedan sedan = ford.criarCarroSedan();
        sedan.informacoesCarroSedan("Fabricação FORD");
        
    }
}

