/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06_04.classes;

/**
 *
 * @author Mateus
 */
public class Sanduiche {

    private String pao;
    private String queijo;
    private String presunto;
    private String salada;

    protected Sanduiche(String pao, String queijo, String presunto, String salada) {
        this.pao = pao;
        this.queijo = queijo;
        this.presunto = presunto;
        this.salada = salada;
    }
    
    public String toString(){
        return getPao() + " " + getQueijo() + " " + getPresunto() + " " + getSalada();
    }

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public String getQueijo() {
        return queijo;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public String getPresunto() {
        return presunto;
    }

    public void setPresunto(String presunto) {
        this.presunto = presunto;
    }

    public String getSalada() {
        return salada;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }
}
