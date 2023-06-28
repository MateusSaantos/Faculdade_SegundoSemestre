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
public class Peixe extends Animal{
    private String tipoHabitat;
    
    public Peixe(){
        
    }
    
    public Peixe(String tipoHabitat){
        this.tipoHabitat = tipoHabitat;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }
    
    public String toString(){
        return "DADOS DO PEIXE: \nNome: " + getNome() + " Peso: " + getPeso() + " Raça: " + getTipoHabitat();
    }
    
    public Peixe cadastrarPeixe(){
        Peixe p = new Peixe();
        Scanner ler = new Scanner(System.in);
        
        String nome, tipoHabitat; 
        double peso;
        
        System.out.println("Informe os dados do Peixe: ");
        System.out.println("Nome:");
        nome = ler.next();
        p.setNome(nome);
        
        System.out.println("Peso:");
        peso = ler.nextDouble();
        p.setPeso(peso);
        
        System.out.println("Raça:");
        tipoHabitat = ler.next();
        p.setTipoHabitat(tipoHabitat);
        
        System.out.println("Cadastro realizado com sucesso!");
        
        return p;
    }
}
