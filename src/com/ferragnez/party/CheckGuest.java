package com.ferragnez.party;
public class CheckGuest {
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);

        String[] listainvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
        System.out.println(listainvitati);
        System.out.println("Lista invitati:");

        for (int i= 0; i < listainvitati.length; i++) {
        
            System.out.println(listainvitati[i]);

        }

        // input.close();
    }
}
