/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista05_01;

import com.mycompany.lista05_01.classes.Nomes;
import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class LISTA05_01 {

    public static void main(String[] args) {        
        Scanner ler = new Scanner(System.in);
        Nomes n = new Nomes();
        
        String dados;
        int flag = 0;
        boolean resp;
        
        while(flag != 2){
            n.cadastrar();
            
            System.out.println("Deseja cadastrar outro nome? \n 1 - SIM \n 2 - SAIR");
            flag = ler.nextInt();
        }
        
        System.out.println("Informe um nome para pesquisar: ");
        dados = ler.next();
        Nomes pesquisa = n.pesquisarNome(dados);
        
        if(pesquisa.getNome() == null){
            System.out.println("Nome ainda não cadastrado!");
            
        } else {
            System.out.println("Nome localizado com sucesso!");
            System.out.println("NOME CADASTRADO: " + pesquisa.getNome());
            
        }
        
        System.out.println("Informe um nome para remover: ");
        dados = ler.next();
         
        n.excluirNome(dados);
        
        n.imprimir();
        
        System.out.println("Deseja apagar todos os nomes armazenados? \n 1 - SIM \n 2 - NÃO");
        flag = ler.nextInt();
        
        if(flag == 1){
            n.excluirDados();
            n.imprimir();
        } else {
            
        }
    }
}
