/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova1_03;

import com.mycompany.prova1_03.classe.Voo;
import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Prova1_03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int vetor[], cadeira;
        
        Voo v = new Voo(1010, "04022023");
        v.livreAcentos();
        v.proximoLivre();
        
        System.out.println("CONSULTA DE CADEIRA: ");
        cadeira = ler.nextInt();
        v.verifica(cadeira);
        
        System.out.println("CADEIRA PARA VIAGEM: ");
        cadeira = ler.nextInt();
        
        if(v.ocupa(cadeira) == true){
            System.out.println("RESERVADO COM SUCESSO");
        } else {
            System.out.println("FALHA! OCUPADO!!");
        }    
        
        System.out.println("CONSULTA DE CADEIRA: ");
        cadeira = ler.nextInt();
        v.verifica(cadeira);
        
        System.out.println("CADEIRAS DISPONIVEIS: " + v.vagas());
        System.out.println("NUMERO DO VOO: " + v.getNumeroVoo());
    }
}
