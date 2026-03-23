package ro.ase.cts.main;

import ro.ase.cts.clase.AbstractBuilder;
import ro.ase.cts.clase.Internare;
import ro.ase.cts.clase.InternareBuilder;

public class Main {
    public static void main(String[] args) {
        Internare internare = new Internare();
        internare.setNumePacient("Ana");
        internare.setPatRabatabil(true);
        Internare internare1 = new Internare();
        internare.setNumePacient("Ela");
        internare.setPatRabatabil(true);

        AbstractBuilder builder = new InternareBuilder("Georgica");

        Internare internare2 = builder.setPatRabatabil(true).build();
        Internare internare3 = builder.setArePapuci(true).setNume("Gigel").build();

        System.out.println(internare2.toString());
        System.out.println(internare3.toString());
    }
}