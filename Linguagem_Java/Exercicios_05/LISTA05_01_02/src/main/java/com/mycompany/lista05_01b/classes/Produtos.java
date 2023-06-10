/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista05_01b.classes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Mateus
 */
public class Produtos {
    private int codigo;
    private String descricao;
    
    Set<Produtos> produtos = new HashSet<>();
    Scanner ler = new Scanner(System.in);
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void cadastrar() {
        System.out.println("CADASTRO DE PRODUTOS: ");
        System.out.println("CODIGO: ");
        codigo = ler.nextInt();

        System.out.println("DESCRIÇÃO: ");
        descricao = ler.next();
        
        Produtos p = new Produtos();
        
        p.setCodigo(codigo);
        p.setDescricao(descricao);

        boolean resp = compararCodigo(codigo);
        if (resp == true) {
            produtos.add(p);
        } else {
            System.out.println("PRODUTO JÁ CADASTRADO!");
        }
    }
    
    public boolean compararCodigo(int codigoComp) {
        Object[] produtosArray = produtos.toArray();
        for(int i = 0; i < produtosArray.length; i++) {
            Produtos p = (Produtos) produtosArray[i];
            if (p.getCodigo() == codigoComp) {
                return false;
            }
        }
        return true;
    }
    
    public void imprimir() {
        Object[] produtosArray = produtos.toArray();
        System.out.println("DADOS CADASTRADOS: ");
        for (int i = 0; i < produtosArray.length; i++) {
            Produtos p = (Produtos) produtosArray[i];
            System.err.println("CODIGO: " + p.getCodigo());
            System.out.println("DESCRICAO: " + p.getDescricao());
        }
    }
}
