/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova1_03.classe;

/**
 *
 * @author Mateus
 */
public class Voo {

    private int numeroVoo;
    private String data;
    private int cadeiras[] = new int[100];
    
    public Voo() {
        
    }
    
    public Voo(int numeroVoo, String data) {
        this.numeroVoo = numeroVoo;
        this.data = data;
    }
    
    public int getNumeroVoo() {
        return numeroVoo;
    }
    
    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public int[] livreAcentos() {
        for (int x = 0; x < this.cadeiras.length; x++) {
            this.cadeiras[x] = x + 1;
        }
        return this.cadeiras;
    }
    
    public int proximoLivre() {
        for (int x = 0; x < this.cadeiras.length; x++) {
            if (this.cadeiras[x] != 0) {
              System.out.println("PROXIMO ACENTO LIVRE: " + cadeiras[x]);
              return 1;
            }
        }
            System.out.println("NÃO HÁ MAIS ACENTOS LIVRES.");
            return 0;
    }
    
    public int verifica(int cadeira){
        for(int x = 0; x < this.cadeiras.length; x++){
            if(this.cadeiras[x] == cadeira){
                System.out.println("CADEIRA DISPONIVEL!");
                return 1;
            }
        } 
        System.out.println("O ACENTO ESTA OCUPADO");
        return 0;
    }
    
    public boolean ocupa(int cadeira){
        for(int x = 0; x < this.cadeiras.length; x++){
            if(this.cadeiras[x] == cadeira){
               this.cadeiras[x] = 0; 
               return true;
            }
        }
        return false;
    }
    
    public int vagas(){
        int contador = 0;
        for(int x = 0; x < this.cadeiras.length; x++){
            if(this.cadeiras[x] != 0){
                contador = contador + 1;
            }
        }
        return contador;
    }   
}
