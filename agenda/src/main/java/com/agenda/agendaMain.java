package com.agenda;

import java.util.Scanner;

public class agendaMain extends contatos {
    public static void main(String[] args) {
        contatos agenda = new contatos();

        while (true) {
            System.out.println("1 - Para adicionar um nome e telefone a agenda.");
            System.out.println("2 - Para listar os contatos salvos.");
            Scanner ler = new Scanner(System.in);
            int escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    agenda.contato();
                    break;
                case 2:
                try {
                    agenda.agenda();
                } catch (Exception e) {
                    System.out.println("Erro");
                }
                default:
                    break;
            }
        }
    }
}