package fr.diginamic.banque.operation;

public class Debit extends Operation {
    private static final String DEBIT = "debit";

    public Debit(String date, float montantOperation) {
        super(date, montantOperation);
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public String getType() {
        return DEBIT;
    }
}
