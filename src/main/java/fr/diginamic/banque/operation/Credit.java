package fr.diginamic.banque.operation;

import fr.diginamic.banque.entities.Compte;

public class Credit extends Operation {
    private static final String CREDIT = "credit";
    private Operation operation;

    public Credit(String date, float montantOperation) {
        super(date, montantOperation);
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public String getType() {
        return CREDIT;
    }
}
