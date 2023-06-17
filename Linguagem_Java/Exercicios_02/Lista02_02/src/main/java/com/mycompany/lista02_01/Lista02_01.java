/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista02_01;

import com.mycompany.lista02_01.componentes.Vertices;
import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Lista02_01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;
        
        Vertices v = new Vertices();
        
        v.verticesVizinhos();
        
        System.out.println("\nInforme qual Vertice deseja saber os vizinhos: ");
        valor = ler.nextInt();
        
        v.verticeInformado(valor);
    }
}
