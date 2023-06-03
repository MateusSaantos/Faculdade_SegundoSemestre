/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista_04_01;

import com.mycompany.lista_04_01.classe.Container;
import com.mycompany.lista_04_01.classe.Container.ConsoleOut;
import com.mycompany.lista_04_01.classe.Container.FileOut;
import java.text.Normalizer;

/**
 *
 * @author Mateus
 */
public class Lista_04_01 {

    public static void main(String[] args) {

        Container c = new Container(1);

        String nome = "Mateus";
        
        //c.addForm(Normalizer.Form.valueOf(nome));
        c.addForm(Normalizer.Form.NFD);
       //FileOut texto = new FileOut("texto.txt");

        
        System.out.println(c.toString());
        

        //fileOut.close();
    }
}
