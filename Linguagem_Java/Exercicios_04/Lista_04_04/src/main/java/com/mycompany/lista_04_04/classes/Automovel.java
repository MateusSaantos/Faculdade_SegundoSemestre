/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_04_04.classes;

/**
 *
 * @author Mateus
 */
public class Automovel extends Veiculo{
    
    @Override
    public void listarVerificacoes() {
        System.out.println("Verificações do Automovel");
    }

    @Override
    public void ajustar() {
        System.out.println("Ajustar Automovel");
    }

    @Override
    public void limpar() {
        System.out.println("Limpar Automovel");
    }
    
    public void trocarOleo(){
        System.out.println("Trocar oleo");
    }
}
