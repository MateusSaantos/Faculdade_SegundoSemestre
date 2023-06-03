/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_04_04.classes;

import java.util.Random;

/**
 *
 * @author Mateus
 */
public class Oficina {
    
    public Veiculo proximo(){
        Random aleatorio = new Random();
        
        int valor = aleatorio.nextInt(10);
        
        if(valor % 2 == 0){
            Veiculo v = new Bicicleta();
            return v;
        } else {
            Veiculo v = new Automovel();
            return v;
        }
    }
    
    public void manutencao(Veiculo v){
        Bicicleta b = new Bicicleta();
        Automovel a = new Automovel();
        
        if(v.equals(b)){
           v.listarVerificacoes();
           v.ajustar();
           v.limpar();
           
        } else {
           v.listarVerificacoes();
           v.ajustar();
           v.limpar();
           a.trocarOleo();
           
        } 
    }
}
