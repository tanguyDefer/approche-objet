package fr.diginamic.approcheimperative.entities;

import fr.diginamic.approcheimperative.entities2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne personne1 = new Personne("1stPersonNom", "1stPersonPrenom",
                new AdressePostale(1,"nom rue", 34990,"Juvignac"));
        Personne personne2 = new Personne("SecPersonNom", "SecPersonPrenom",
                new AdressePostale(1,"nom rue2", 34990,"Juvignac2"));
        System.out.println(personne1);
    }

}
