package fr.diginamic.banque;

import fr.diginamic.banque.entities.Compte;
import fr.diginamic.banque.entities.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte[] comptes;
        comptes = new Compte[2];
        comptes[0] = new Compte("123456FR", 10000);
        comptes[1] = new CompteTaux("DE5454", 500,2);
        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
