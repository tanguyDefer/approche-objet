package fr.diginamic.banque.entities;

public class CompteTaux extends Compte{
    private Compte compte;
    private double taux;


    public String toString() {
        String compteString = super.toString();
        return compteString+=" taux=" + taux + '}';
    }


    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }


    public CompteTaux(String numeroCompte, float soldeCompte, double taux) {
        super(numeroCompte, soldeCompte);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }


}
