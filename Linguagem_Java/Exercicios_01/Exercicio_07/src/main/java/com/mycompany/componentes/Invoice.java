/*
 */
package com.mycompany.componentes;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Invoice {

    private int codigo;
    private String descricao;
    private int quantidade;
    private double valor;

    public Invoice() {

    }
    
    public Invoice(int codigo, String descricao, int quantidade, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getInvoiceAmount(){
        double total;
        
        total = this.quantidade * this.valor;
        
        return total;
    }
}
