/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista05_02;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mateus
 */
public class LISTA05_02 {

    public static void main(String[] args) {
        Map<String, String> funcionarios = new HashMap<>();

        String funcionario;

        funcionarios.put("a1234", "Steve Jobs");
        funcionarios.put("a1235", "Scott McNealy");
        funcionarios.put("a1236", "Jeff Bezos");
        funcionarios.put("a1237", "Larry Ellison");
        funcionarios.put("a1238", "Bill Gates");

        String id1 = "a1234";
        String id2 = "a1235";
        String id3 = "a1236";
        String id4 = "a1237";
        String id5 = "a1238";

        funcionario = funcionarios.get(id1);
        System.out.println("ID: " + id1 + " FUNCIONARIO: " + funcionario);

        funcionario = funcionarios.get(id2);
        System.out.println("ID: " + id2 + " FUNCIONARIO: " + funcionario);

        funcionario = funcionarios.get(id3);
        System.out.println("ID: " + id3 + " FUNCIONARIO: " + funcionario);

        funcionario = funcionarios.get(id4);
        System.out.println("ID: " + id4 + " FUNCIONARIO: " + funcionario);

        funcionario = funcionarios.get(id5);
        System.out.println("ID: " + id5 + " FUNCIONARIO: " + funcionario);

        System.out.println("TESTANDO UMA ID FALSA");

        String falsa = "a205020";

        funcionario = funcionarios.get(falsa);
        System.out.println("ID: " + falsa + " FUNCIONARIO: " + funcionario);

        System.out.println("TESTANDO UMA ID MAIUSCUULA");

        String maiuscula = "A1234";

        buscaFuncionario(funcionarios, maiuscula);

        System.out.println("ALTERAÇÃO FUNCIONARIOS");
        Funcionario f1 = new Funcionario();
        f1.setNome("Steve Jobs");
        f1.setCargo("Gerente");
        f1.setSalario(25000);

        Funcionario f2 = new Funcionario();
        f2.setNome("Scott McNealy");
        f2.setCargo("COO");
        f2.setSalario(12000);

        Funcionario f3 = new Funcionario();
        f3.setNome("Jeff Bezos");
        f3.setCargo("Vice Presidente");
        f3.setSalario(50000);

        Funcionario f4 = new Funcionario();
        f4.setNome("Larry Ellison");
        f4.setCargo("Gerente Fiscal");
        f4.setSalario(9000);

        Funcionario f5 = new Funcionario();
        f5.setNome("Bill Gates");
        f5.setCargo("Desenvolvedor");
        f5.setSalario(40000);

        Map<String, Funcionario> funcionariosAlteracao = new HashMap<>();

        funcionariosAlteracao.put("a1234", f1);
        funcionariosAlteracao.put("a1235", f2);
        funcionariosAlteracao.put("a1236", f3);
        funcionariosAlteracao.put("a1237", f4);
        funcionariosAlteracao.put("a1238", f5);

        for (String chave : funcionariosAlteracao.keySet()) {
            Funcionario f = funcionariosAlteracao.get(chave);
            System.out.println("ID: " + chave + ", NOME: " + f.getNome() + ", CARGO: " + f.getCargo() + ", SALARIO: " + f.getSalario());
        }
    }

    public static void buscaFuncionario(Map<String, String> funcionarios, String maiuscula) {
        String resposta = funcionarios.get(maiuscula.toLowerCase());
        System.out.println("ID: " + maiuscula + " FUNCIONARIO: " + resposta);
    }
}
