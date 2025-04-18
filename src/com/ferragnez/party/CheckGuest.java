package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // LISTA INVITATI
        String[] listaInvitati = { 
            "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", 
            "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", 
            "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" 
        };

        // L'UTENTE INSERISCE IL NOME
        System.out.print("Inserisci il tuo nome: ");
        String nomeInvitato = input.nextLine();

        boolean invitatoTrovato = false;

        // VERIFICARE SE IL NOME INSERITO E' IN LISTA
        for (int i = 0; i < listaInvitati.length; i++) {
            if (listaInvitati[i].equalsIgnoreCase(nomeInvitato)) {
                invitatoTrovato = true;
                break;
            }
        }

        // RISPOSTA
        if (invitatoTrovato) {
            System.out.println("Benvenuto alla festa!");
        } else {
            System.out.println("Mi dispiace, non sei nella lista.");
        }

        input.close();
    }
}