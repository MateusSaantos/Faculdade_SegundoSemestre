/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista05_01.classes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Mateus
 */
public class Nomes {

    private String nome;

    Set<Nomes> nomes = new HashSet<>();
    Scanner ler = new Scanner(System.in);

    public Nomes() {

    }

    public Nomes(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrar() {
        System.out.println("Informe um nome para cadastrar: ");
        nome = ler.next();

        Nomes n = new Nomes();
        n.setNome(nome);

        boolean resp = compararNomes(nome);
        if (resp == true) {
            nomes.add(n);
        } else {
            System.out.println("Este nome já se encontra na nossa base de dados!");
        }
    }

    public boolean compararNomes(String nomeComp) {
        Object[] nomesArray = nomes.toArray();
        for (int i = 0; i < nomesArray.length; i++) {
            Nomes n = (Nomes) nomesArray[i];
            if (n.getNome().equals(nomeComp)) {
                return false;
            }
        }
        return true;
    }

    public Nomes pesquisarNome(String pesquisa) {
        Object[] nomesArray = nomes.toArray();
        for (int i = 0; i < nomesArray.length; i++) {
            Nomes n = (Nomes) nomesArray[i];
            if (n.getNome().equals(pesquisa)) {
                return n;
            }
        }
        Nomes n = new Nomes();
        n.nome = null;
        return n;
    }

    public void excluirNome(String dados) {
        Nomes excluir = pesquisarNome(dados);
        if (excluir.getNome() != null) {
            nomes.remove(excluir);
            System.out.println("Nome removido com sucesso!");
        } else {
            System.out.println("Nome não encontrado na lista!");
        }
    }

    public void imprimir() {
        Object[] nomesArray = nomes.toArray();
        System.out.println("DADOS CADASTRADOS: ");
        for (int i = 0; i < nomesArray.length; i++) {
            Nomes n = (Nomes) nomesArray[i];
            System.out.println("NOME: " + n.getNome());
        }
    }
    
    public void excluirDados(){
        nomes.clear();
    }
}
