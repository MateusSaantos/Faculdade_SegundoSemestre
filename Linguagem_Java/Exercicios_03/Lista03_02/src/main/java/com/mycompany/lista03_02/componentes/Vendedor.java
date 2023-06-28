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
public class Vendedor extends Empregado{
    private double valorVendas;
    private int qtdVendas;
    
    public Vendedor(){
        
    }
    
    public Vendedor(double valorVendas, int qtdVendas){
        this.valorVendas = valorVendas;
        this.qtdVendas = qtdVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }
    
    public String toString(){
        return "DADOS DO VENDEDOR: \nNome: " + getNome() + " Salario: " + getSalario() + " Valor das Vendas: " + getValorVendas() + 
                " Quantidade de Vendas: " + getQtdVendas();
    }
    
    public Vendedor cadastrarVendedor(){
        Vendedor v = new Vendedor();
        Scanner ler = new Scanner(System.in);
        
        String nome, sexo, matricula;
        int idade, qtdVendas;
        double valorVendas, salario;
        
        System.out.println("CADASTRO DE VENDEDOR");
        
        System.out.println("Nome: ");
        nome = ler.next();
        v.setNome(nome);
        
        System.out.println("Idade: ");
        idade = ler.nextInt();
        v.setIdade(idade);
        
        System.out.println("Salario: ");
        salario = ler.nextDouble();
        v.setSalario(salario);
        
        System.out.println("Sexo: ");
        sexo = ler.next();
        v.setSexo(sexo);
        
        System.out.println("Matricula: ");
        matricula = ler.next();
        v.setMatricula(matricula);
        
        System.out.println("Valor de Vendas: ");
        valorVendas = ler.nextDouble();
        v.setValorVendas(valorVendas);
        
        System.out.println("Quantidade de Vendas: ");
        qtdVendas = ler.nextInt();
        v.setQtdVendas(qtdVendas);
        
        return v;
    }
    
}
