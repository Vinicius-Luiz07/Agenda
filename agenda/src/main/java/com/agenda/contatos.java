package com.agenda;

import java.util.Scanner;
import java.util.ArrayList;

public class contatos extends GettersAndSetters{

    Scanner leia = new Scanner(System.in);
    ArrayList<Integer> agenda = new ArrayList<>();

    public void contato() {
    Scanner leia = new Scanner(System.in); 

    System.out.println("Digite um nome para adicionar na agenda:");
    String nome = leia.nextLine().trim();

    if (nome.isEmpty()) {
        System.out.println("Por favor, digite um nome válido!");
        return;
    } else {
        setNomes(nome);
        System.out.println(getNomes() + " adicionada à agenda.");
    }

    System.out.println("Digite um telefone (somente números):");
    String telefone = leia.nextLine().trim();

    if (!telefone.matches("\\d{8,13}")) {
        System.out.println("Número inválido (precisa ter de 8 a 13 dígitos numéricos).");
    } else {
        setTelefone(telefone);
        System.out.println("Telefone salvo!");
    }
}

    protected ArrayList<String> agenda() throws Exception {

    ArrayList<String> agenda = new ArrayList<>();

    agenda.add("Nome: " + getNomes());
    agenda.add("Telefone: " + getTelefone());

    if (agenda.isEmpty()) {
        throw new Exception("Não há nenhum contato na agenda.");
    }

    for (String contato : agenda) {
        System.out.println(contato);
    }
    return agenda;
}
    
}
