/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova2_01.classe;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(){
        
    }
    
    public Data(int dia, int mes, int ano){
        if(dia > 0 || dia < 30){
            this.dia = dia;
        } else {
            this.dia = 1;
        }
        
        if(mes > 0 || mes < 12){
            this.mes = mes;
        } else {
            this.mes = 1;
        }
        
        if(ano > 2000 || ano < 2050){
            this.ano = ano;
        } else {
            this.ano = 2000;
        }
    }
    
        public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String toString(){
        
        return this.dia + "/" + this.mes + "/" + this.ano;
        
    }
    
    public String avancaData(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
        
        if(this.dia ==  30){
           this.dia = 1; 
           if(this.mes == 12){
               this.mes = 1;
               this.ano = this.ano + 1;
           }     
        } else {
            this.dia = this.dia + 1;
        }
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
