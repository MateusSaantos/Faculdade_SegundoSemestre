/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista03_02;

import com.mycompany.lista03_02.componentes.Cliente;
import com.mycompany.lista03_02.componentes.Gerente;
import com.mycompany.lista03_02.componentes.Vendedor;
import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Lista03_02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;
        
        System.out.println("QUAL DAS FUNÇÕES DESEJA TESTAR: ");
        System.out.println("1 - CLIENTE");
        System.out.println("2 - VENDEDOR");
        System.out.println("3 - GERENTE");
        System.out.println("4 - SAIR");
        valor = ler.nextInt();
        
        if(valor == 1){
            Cliente c = new Cliente();
            c = c.cadastrarCliente();
            
            System.out.println(c.toString());
            
        } else if(valor == 2){
            Vendedor v = new Vendedor();
            v = v.cadastrarVendedor();
            
            System.out.println(v.toString());
        
        } else if(valor == 3){
            Gerente g = new Gerente();
            g = g.cadastrarGerente();
            
            System.out.println(g.toString());
            
        } else if(valor == 4){
            System.out.println("Encerrando...");
            
        } else{
            System.out.println("Opção incorreta");
        }
        
    }
}
