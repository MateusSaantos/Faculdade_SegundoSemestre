/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista05_07.classes;

/**
 *
 * @author Mateus
 */
public class Conta {
    
    private double saldo;
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    
    public void saca(double saque) throws ContaExcepition {
        double valorDisponivel = this.saldo + this.limite;
        
        if (valorDisponivel < saque) {
            throw new ContaExcepition("Você não tem saldo suficiente! \n SALDO EM CONTA: ", getSaldo());
        }
        this.saldo = this.saldo - saque;
    }
}
