/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02_01.componentes;

/**
 *
 * @author Mateus
 */
public class Vertices {

    int[] vertice1 = {2, 5};
    int[] vertice2 = {1, 3, 4, 5};
    int[] vertice3 = {2, 4};
    int[] vertice4 = {2, 3, 5};
    int[] vertice5 = {1, 2, 4};

    public void verticesVizinhos() {
        System.out.println("VERTICE | LISTA DE ADJASCENTES");
        System.out.print("VERTICE 1 - ");

        for (int x = 0; x < vertice1.length; x++) {
            System.out.print(vertice1[x] + " ");
        }

        System.out.print("\nVERTICE 2 - ");

        for (int x = 0; x < vertice2.length; x++) {
            System.out.print(vertice2[x] + " ");
        }

        System.out.print("\nVERTICE 3 - ");

        for (int x = 0; x < vertice3.length; x++) {
            System.out.print(vertice3[x] + " ");
        }

        System.out.print("\nVERTICE 4 - ");

        for (int x = 0; x < vertice4.length; x++) {
            System.out.print(vertice4[x] + " ");
        }

        System.out.print("\nVERTICE 5 - ");

        for (int x = 0; x < vertice5.length; x++) {
            System.out.print(vertice5[x] + " ");
        }
    }

    public void verticeInformado(int valor) {
        if (valor == 1) {
            System.out.print("VERTICE 1 - ");

            for (int x = 0; x < vertice1.length; x++) {
                System.out.print(vertice1[x] + " ");
            }

        } else if (valor == 2) {
            System.out.print("VERTICE 2 - ");

            for (int x = 0; x < vertice2.length; x++) {
                System.out.print(vertice2[x] + " ");
            }

        } else if (valor == 3) {

            System.out.print("VERTICE 3 - ");

            for (int x = 0; x < vertice3.length; x++) {
                System.out.print(vertice3[x] + " ");
            }

        } else if (valor == 4) {
            System.out.print("VERTICE 4 - ");

            for (int x = 0; x < vertice4.length; x++) {
                System.out.print(vertice4[x] + " ");
            }

        } else if (valor == 5) {
            System.out.print("VERTICE 5 - ");

            for (int x = 0; x < vertice5.length; x++) {
                System.out.print(vertice5[x] + " ");
            }

        } else {
            System.out.println("Dado informado incorretamente!");
        }
    }

}
