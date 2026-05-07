package ro.ase.cts.chain.clase;

public abstract class CalatorieHandler {
    protected CalatorieHandler succesor;

    public CalatorieHandler() {
        this.succesor=null;
    }

    public void setHandler(CalatorieHandler succesor) {
        this.succesor = succesor;
    }

    public abstract String recomandaCalatorie(double distanta);
}