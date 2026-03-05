package ro.ase.seminar2.clase;

import java.util.Arrays;

public abstract class Aplicant{
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nr_proiecte;
    protected String[] denumireProiect;

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nr_proiecte = nr_proiecte;
        this.denumireProiect = denumireProiect;
    }

    public Aplicant() {
        super();
    }

    public void statut(){
        if(punctaj>80)
            System.out.println("Aplicantul "+nume+" "+prenume+" a fost acceptat.");
        else
            System.out.println("Aplicantul "+nume+" "+prenume+" nu a fost acceptat.");
    }

    public abstract int finantare();

    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public int getVarsta() {
        return varsta;
    }
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getPunctaj() {
        return punctaj;
    }
    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }

    public int getNr_proiecte() {
        return nr_proiecte;
    }
    public void setNr_proiecte(int nr_proiecte, String[] denumireProiect) {

        this.nr_proiecte = nr_proiecte;
        this.denumireProiect=denumireProiect;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("nume=").append(this.nume);
        builder.append(", prenume=").append(this.prenume);
        builder.append(", varsta=").append(this.varsta);
        builder.append(", punctaj=").append(this.punctaj);
        builder.append(", nr_proiecte=").append(this.nr_proiecte);
        builder.append(", denumireProiect=").append(Arrays.toString(this.denumireProiect));
        builder.append(", ");

        return builder.toString();
    }
}
