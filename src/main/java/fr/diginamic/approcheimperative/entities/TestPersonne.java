package fr.diginamic.approcheimperative.entities;

import fr.diginamic.approcheimperative.entities2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne personne1 = new Personne("1stPersonNom", "1stPersonPrenom");
        personne1.setAdressePostale(new AdressePostale(1, "rue de la rue", 34990, "Juvignac"));

        System.out.println(personne1);
    }

}
