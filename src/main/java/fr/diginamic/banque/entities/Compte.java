package fr.diginamic.banque.entities;

public class Compte {
    private final String numeroCompte;
    private float soldeCompte;

    public void setSoldeCompte(float soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public float getSoldeCompte() {
        return soldeCompte;
    }

    public Compte(String numeroCompte, float soldeCompte) {
        super();
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte='" + numeroCompte + '\'' +
                ", soldeCompte=" + soldeCompte +
                '}';
    }
}
