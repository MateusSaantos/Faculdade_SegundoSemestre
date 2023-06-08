/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista06_04;

import com.mycompany.lista06_04.classes.FabricaAbstrataDeLanchonetes;
import com.mycompany.lista06_04.classes.FazLanchonete;
import com.mycompany.lista06_04.classes.Sanduiche;

/**
 *
 * @author Mateus
 */
public class LISTA06_04 {

    public static void main(String[] args) {
        
        FabricaAbstrataDeLanchonetes lanchonete = new FazLanchonete();
        
        Sanduiche sanduiche = lanchonete.FactoryLanchonete("LanchoneteCG");
        
        System.out.println("SANDUICHE GERADO: " + sanduiche.toString());
        
    }
}
