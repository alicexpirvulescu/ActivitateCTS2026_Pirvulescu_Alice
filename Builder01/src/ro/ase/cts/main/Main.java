package ro.ase.cts.main;

import ro.ase.cts.clase.Internare;

public class Main {
    public static void main(String[] args) {
        Internare internare = new Internare();
        internare.setHalat(true);
        internare.setMicDejun(false);

        System.out.println(internare);

    }
}