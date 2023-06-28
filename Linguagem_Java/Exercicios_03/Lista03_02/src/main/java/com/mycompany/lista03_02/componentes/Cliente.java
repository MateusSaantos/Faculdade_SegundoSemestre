/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista03_02.componentes;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Cliente extends Pessoa{
    private double valorDivida;
    private int anoNascim;
    
    public Cliente(){
        
    }
    
    public Cliente(double valorDivida, int anoNascim){
        this.valorDivida = valorDivida;
        this.anoNascim = anoNascim;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascim() {
        return anoNascim;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }
    
    public String toString(){
        return "DADOS DO CLIENTE: \nNome: " + getNome() + " Idade: " + getIdade() + " Sexo: " + getSexo() + 
                " Valor da Divida: " + getValorDivida() + " Ano Nascimento: " + getAnoNascim();
    }
    
    public Cliente cadastrarCliente(){
        Cliente c = new Cliente();
        Scanner ler = new Scanner(System.in);
        
        String nome, sexo;
        int idade, anoNascim;
        double valorDivida;
        
        System.out.println("CADASTRO DE CLIENTE");
        
        System.out.println("Nome: ");
        nome = ler.next();
        c.setNome(nome);
        
        System.out.println("Idade: ");
        idade = ler.nextInt();
        c.setIdade(idade);
        
        System.out.println("Sexo: ");
        sexo = ler.next();
        c.setSexo(sexo);
        
        System.out.println("Valor da Divida: ");
        valorDivida = ler.nextDouble();
        c.setValorDivida(valorDivida);
        
        System.out.println("Ano Nascimento: ");
        anoNascim = ler.nextInt();
        c.setAnoNascim(anoNascim);
        
        return c;
    }
}
