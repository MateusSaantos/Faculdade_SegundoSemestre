/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista_04_04;

import com.mycompany.lista_04_04.classes.Oficina;
import com.mycompany.lista_04_04.classes.Veiculo;

/**
 *
 * @author Mateus
 */
public class Lista_04_04 {

    public static void main(String args[]) {
        Oficina o = new Oficina();
        Veiculo v;
        for (int i = 0; i < 4; ++i) {
            v = o.proximo();
            o.manutencao(v);
        }
    }
}
