/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista05_04;

import com.mycompany.lista05_04.classes.Funcionarios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Mateus
 */
public class LISTA05_04 {

    public static void main(String[] args) {
        
        ArrayList<Funcionarios> funcionarios = new ArrayList<>();
        
        Funcionarios f1 = new Funcionarios("1", "Mateus", 3000, new Date(2020, 1, 1));
        Funcionarios f2 = new Funcionarios("2", "Ana", 5000, new Date(2021, 1, 1));
        Funcionarios f3 = new Funcionarios("3", "Luiz", 4000, new Date(2022, 1, 1));
        
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        
        System.out.println("FUNCIONARIOS POR ORDEM DE SALARIO");
        
        Collections.sort(funcionarios);
        
        for(int x = 0; x < funcionarios.size(); x++){
           Funcionarios f = funcionarios.get(x);
           f.imprimir(f);
        }
        
        System.out.println("FUNCIONARIOS POR ORDEM ALFABETICA");
        
        Collections.sort(funcionarios, new Comparator<Funcionarios>() {
            public int compare(Funcionarios f1, Funcionarios f2) {
                return f1.getNome().compareTo(f2.getNome());
            }
        });
        
        for(int x = 0; x < funcionarios.size(); x++){
           Funcionarios f = funcionarios.get(x);
           f.imprimir(f);
        }
        
        Funcionarios maior = Collections.max(funcionarios);
        Funcionarios menor = Collections.min(funcionarios);
        
        System.out.println("MAIOR SALARIO: " + maior.getNome());
        System.out.println("MENOR SALARIO: " + menor.getNome());
        
        Funcionarios mais = Collections.min(funcionarios, new Comparator<Funcionarios>() {
            public int compare(Funcionarios f1, Funcionarios f2) {
                return f1.getData().compareTo(f2.getData());
            }
        });
        Funcionarios menos = Collections.max(funcionarios, new Comparator<Funcionarios>() {
            public int compare(Funcionarios f1, Funcionarios f2) {
                return f1.getData().compareTo(f2.getData());
            }
        });
        System.out.println("Funcionário mais experiente: " + mais.getNome());
        System.out.println("Funcionário menos experiente: " + menos.getNome());
    }
}
