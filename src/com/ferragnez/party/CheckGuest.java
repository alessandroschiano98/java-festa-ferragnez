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

        /* // SE AVESSI VOLUTO FAR USCIRE ANCHE LA LISTA VISIBILE
         * for (int i = 0; i < listaInvitati.length; i++){
         * System.out.println(listaInvitati[i]);
         * }
         */

        // MESSAGGIO DI BENVENUTO
        System.out.println(
                "Benvenuto al Ferragnez-Party, mi dica il suo nominativo così che possa verificare se è un invitato. ");

        // L'UTENTE INSERISCE IL NOME
        System.out.println("Inserisca il suo nome: ");
        String nomeInvitato = input.nextLine();

        boolean invitatoTrovato = false; // COSI' QUALSIASI NOME INSERITO DALL'UTENTE NON CORRISPONDA A QUELLA DEGLI
                                         // ARRAY DARA' SEMPRE FALSO

        // VERIFICARE SE IL NOME INSERITO E' IN LISTA
        for (int i = 0; i < listaInvitati.length; i++) {
            if (listaInvitati[i].equalsIgnoreCase(nomeInvitato)) {
                invitatoTrovato = true; // QUI INVECE SE IL NOME DELL'UTENTE INSERITO CORRISPONDE A QUELLO DELLA
                break;                        // listainvitati[i] E' TRUE
            }
        }

        // RISPOSTA
        if (invitatoTrovato) {
            System.out.println("Il suo nome è nella lista, si accomodi pure " + "Sign/Sig.ra " + nomeInvitato + ".");
        } else {
            System.out.println("Mi dispiace, non sei nella lista.");
        }

        input.close();
    }
}