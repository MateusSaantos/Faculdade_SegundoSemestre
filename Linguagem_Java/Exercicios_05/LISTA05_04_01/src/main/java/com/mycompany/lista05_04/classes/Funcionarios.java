/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista05_04.classes;

import java.util.Date;

/**
 *
 * @author Mateus
 */
public class Funcionarios implements Comparable<Funcionarios>{
    private String codigo;
    private String nome;
    private int salario;
    private Date data;

    public Funcionarios(String codigo, String nome, int salario, Date data) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
        this.data = data;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    
    public void imprimir(Funcionarios f){
        System.out.println("CODIGO: " + f.getCodigo() + " NOME: " + f.getNome() + " SALARIO: " + f.getSalario() + " DATA: " + f.getData());
    } 

    @Override
    public int compareTo(Funcionarios f) {
        if (this.salario < f.salario) {
            return -1;
        } else if (this.salario > f.salario) {
            return 1;
        } else {
            return 0;
        }
    }
}
