package ro.ase.cts.factory.clase.mijlocTransport;

import ro.ase.cts.factory.clase.MijlocTransport;

public class Troleibuz implements MijlocTransport {
    private int nrLinie;
    private String marca;

    public Troleibuz(int nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Troleibuzul de pe linia ").append(this.nrLinie).append(" este produs de ").append(this.marca);
        System.out.printf(sb.toString());
    }
}