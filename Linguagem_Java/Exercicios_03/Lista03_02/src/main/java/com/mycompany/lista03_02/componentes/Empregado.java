/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista03_02.componentes;

/**
 *
 * @author Mateus
 */
public class Empregado extends Pessoa{
    private double salario;
    private String matricula;
    
    public Empregado(){
        
    }
    
    public Empregado(double salario, String matricula){
        this.salario = salario;
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double valorInss(double salario){
        salario = salario * 0.11;

        return salario;
    }
}
