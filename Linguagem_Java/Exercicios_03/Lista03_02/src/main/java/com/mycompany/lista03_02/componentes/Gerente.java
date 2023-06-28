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
public class Gerente extends Empregado{
    private String nomeGerencia;
    
    public Gerente(){
        
    }
    
    public Gerente(String nomeGerencia){
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }
    
    public String toString(){
        return "DADOS DO GERENTE: \nNome: " + getNome() + " Idade: " + getIdade() + " Matricula: : " + getMatricula() + 
                " Nome da Gerencia: " + getNomeGerencia() + " Valor INSS: " + valorInss(getSalario());
    }
    
    public Gerente cadastrarGerente(){
        Gerente g = new Gerente();
        Scanner ler = new Scanner(System.in);
        
        String nome, sexo, matricula, nomeGerencia;
        int idade;
        double salario;
        
        System.out.println("CADASTRO DE GERENTE");
        
        System.out.println("Nome: ");
        nome = ler.next();
        g.setNome(nome);
        
        System.out.println("Idade: ");
        idade = ler.nextInt();
        g.setIdade(idade);
        
        System.out.println("Sexo: ");
        sexo = ler.next();
        g.setSexo(sexo);
        
        System.out.println("Matricula: ");
        matricula = ler.next();
        g.setMatricula(matricula);
        
        System.out.println("Salario: ");
        salario = ler.nextDouble();
        g.setSalario(salario);
        
        System.out.println("Nome Gerencia: ");
        nomeGerencia = ler.next();
        g.setNomeGerencia(nomeGerencia);
        
        return g;
    }
}
