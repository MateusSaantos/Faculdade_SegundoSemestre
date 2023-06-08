/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista06_02;

import com.mycompany.lista06_02.classes.Incremental;

/**
 *
 * @author Mateus
 */
public class LISTA06_02 {

    public static void main(String[] args) {
        for(int x = 0; x < 10; x ++){
            Incremental inc = Incremental.iniciaIncremental();
            System.out.println(inc);
        }
    }
}
