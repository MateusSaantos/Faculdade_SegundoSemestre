/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista05_07.classes;

/**
 *
 * @author Mateus
 */
public class ContaExcepition extends Exception{

    private double saldo;
    
    public ContaExcepition(String mensagem, double saldo) {
        super(mensagem);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
