package fr.diginamic.approcheimperative.entities;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adressePostale1 = new AdressePostale(1,"nom rue", 34990,"Juvignac");
        AdressePostale adressePostale2 = new AdressePostale(2,"autre ure", 34990,"Juvignac");
        System.out.println(adressePostale1);
        System.out.println(adressePostale2);
    }
}
