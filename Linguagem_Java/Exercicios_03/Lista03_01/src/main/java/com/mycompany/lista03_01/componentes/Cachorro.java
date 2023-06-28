/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista03_01.componentes;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Cachorro extends Animal{
    private String raca;
    
    public Cachorro(){
        
    }
    
    public Cachorro(String raca){
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public String toString(){
        return "DADOS DO CACHORRO: \nNome: " + getNome() + " Peso: " + getPeso() + " Raça: " + getRaca();
    }
    
    public Cachorro cadastrarCachorro(){
        Cachorro c = new Cachorro();
        Scanner ler = new Scanner(System.in);
        
        String nome, raca; 
        double peso;
        
        System.out.println("Informe os dados do Cachorro: ");
        System.out.println("Nome:");
        nome = ler.next();
        c.setNome(nome);
        
        System.out.println("Peso:");
        peso = ler.nextDouble();
        c.setPeso(peso);
        
        System.out.println("Raça:");
        raca = ler.next();
        c.setRaca(raca);
        
        System.out.println("Cadastro realizado com sucesso!");
        
        return c;
    }
}
