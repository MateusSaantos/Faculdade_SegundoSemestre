/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02_01.componentes;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */

public class Players {

    private String jogador1;
    private String jogador2;
    
    public Players(){
    
    }
    
    public Players(String jogador1, String jogador2){
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public String getJogador1() {
        return jogador1;
    }

    public void setJogador1(String jogador1) {
        this.jogador1 = jogador1;
    }

    public String getJogador2() {
        return jogador2;
    }

    public void setJogador2(String jogador2) {
        this.jogador2 = jogador2;
    }
    
    public Players cadastraPlayer(){
        Players p1 = new Players();
        Scanner input = new Scanner (System.in);
        String jogador1, jogador2;
        
        System.out.println("Informe o nome do jogador X:");
        jogador1 = input.next();
        p1.setJogador1(jogador1);
        
        System.out.println("Informe o nome do jogador O:");
        jogador2 = input.next();
        p1.setJogador2(jogador2);
        
        return p1;
    }
}
