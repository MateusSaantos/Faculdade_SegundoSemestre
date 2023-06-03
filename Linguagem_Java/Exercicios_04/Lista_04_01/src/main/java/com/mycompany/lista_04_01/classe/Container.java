/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_04_01.classe;

import java.io.*;
import java.io.PrintStream;
import java.text.Normalizer.Form;

/**
 *
 * @author Mateus
 */
public class Container {
    private Form[] forms;
    private int cont;

    public Container(int tamanho) {
        forms = new Form[tamanho];
        cont = 0;
    }

    public void addForm(Form f) {
        if (cont < forms.length) {
            forms[cont] = f;
            cont++;
        }
    }
    
    public void print(PrintStream out) {
        for (Form f : forms) {
            if (f != null) {
                out.println(f.toString());
            }
        }
        out.flush();
    }
    
    public interface Out {
        public void flush(Form f);
    }
    
    public class ConsoleOut implements Out {
    public void flush(Form f) {
        System.out.println(f.toString());
        }
    }
    
public class FileOut implements Out {
    private BufferedWriter writer;

    public FileOut(String filename) throws IOException {
        writer = new BufferedWriter(new FileWriter(filename));
    }

    public void flushText(Form f) throws IOException {
        writer.write(f.toString());
        writer.newLine();
    }

    public void close() throws IOException {
        writer.close();
    }

        @Override
        public void flush(Form f) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
