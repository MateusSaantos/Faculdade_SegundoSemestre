/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06_07.classes;

import java.util.ArrayList;

/**
 *
 * @author Mateus
 */
public class AdapterSomador implements SomadorEsperado {

    private SomadorExistente somador;

    public AdapterSomador(SomadorExistente somador) {
        this.somador = somador;
    }

    @Override
    public int somaVetor(int[] vetor) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int numero : vetor) {
			lista.add(numero);
		}

		return somador.somaLista(lista);
	}
}