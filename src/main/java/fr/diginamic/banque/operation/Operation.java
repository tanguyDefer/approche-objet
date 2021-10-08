package fr.diginamic.banque.operation;

public abstract class Operation {
    private final String date;

    public float getMontantOperation() {
        return montantOperation;
    }

    private final float montantOperation;

    public Operation(String date, float montantOperation) {
        this.date = date;
        this.montantOperation = montantOperation;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "date='" + date + '\'' +
                ", montantOperation=" + montantOperation +
                '}';
    }

    public abstract String getType();

}
