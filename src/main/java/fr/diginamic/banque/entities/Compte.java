package fr.diginamic.banque.entities;

public class Compte {
    private String numeroCompte;
    private float soldeCompte;

    public Compte(String numeroCompte, float soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }
}