package fr.diginamic.banque;

import fr.diginamic.banque.entities.Compte;
import fr.diginamic.banque.entities.CompteTaux;
import fr.diginamic.banque.operation.Credit;
import fr.diginamic.banque.operation.Debit;
import fr.diginamic.banque.operation.Operation;

import java.util.Objects;

public class TestOperation {
    public static void main(String[] args) {
        Compte[] comptes;
        comptes = new Compte[4];
        comptes[0] = new Compte("123456FR", 10000);
        comptes[1] = new Compte("123456FR", 20);
        comptes[2] = new CompteTaux("DE5454", 500,2);
        comptes[3] = new CompteTaux("DE5454", 488,2);

        Operation[] operations;
        operations = new Operation[4];
        operations[0] = new Debit("08/10/2021", 50);
        operations[1] = new Debit("17/09/2021", 80);
        operations[2] = new Credit("10/08/2021", 100);
        operations[3] = new Credit("19/01/2021", 265);

        for (int i = 0; i < comptes.length; i++) {
                if (Objects.equals(operations[i].getType(), "credit")) {
                    comptes[i].setSoldeCompte(comptes[i].getSoldeCompte() + operations[i].getMontantOperation());
                }
                if (Objects.equals(operations[i].getType(), "debit")) {
                    comptes[i].setSoldeCompte(comptes[i].getSoldeCompte() - operations[i].getMontantOperation());
                }
                System.out.println(comptes[i]);
        }
    }
}
