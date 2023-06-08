/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista06_01;

import com.mycompany.lista06_01.classes.Jogo;

/**
 *
 * @author Mateus
 */
public class LISTA06_01 {

    public static void main(String[] args) {
        
        Jogo jogo = Jogo.inicioJogo();
        
        jogo.setCasa("Flamengo");
        jogo.setVisitante("Vasco");
        
        Jogo jogo2 = Jogo.inicioJogo();
        
        if(jogo == jogo2){
            System.out.println("É igual!");
        }
    }
}
