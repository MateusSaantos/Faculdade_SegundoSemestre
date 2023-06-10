/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista05_08;

/**
 *
 * @author Mateus
 */
public class LISTA05_08 {

    public static void main(String[] args) {
        try {
            int[] array = new int[10];

            for (int x = 0; x <= 15; x++) {
                array[x] = x;
            }

        } catch (Exception e) {
            System.out.println("CAPTURADO NA MAIN");
            e.printStackTrace();
        }

        metodoComTryProprio();
    }

    public static void metodoComTryProprio() {
        try {
            int[] array = new int[10];

            for (int x = 0; x <= 15; x++) {
                array[x] = x;
            }
        } catch (Exception e) {
            System.out.println("CAPTURADO NO METODO");
            e.printStackTrace();
        }
    }
}
