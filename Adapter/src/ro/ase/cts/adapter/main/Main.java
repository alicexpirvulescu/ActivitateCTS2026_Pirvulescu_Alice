package ro.ase.cts.adapter.main;


import ro.ase.cts.adapter.clase.farmacie.Medicament;
import ro.ase.cts.adapter.clase.adapter.Adaptor;

public class Main {

    public static void procurareMedicament(Medicament medFarmacie)
    {
        medFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        ro.ase.cts.adapter.clase.spital.Medicament medSpital = new ro.ase.cts.adapter.clase.spital.Medicament("nurofen forte",25.0f);
        Medicament medFarma = new Medicament("medtest");

        //procurareMedicament(medSpital);
        procurareMedicament(medFarma);
        Adaptor adaptorDinSpital = new Adaptor(medSpital);
        procurareMedicament(adaptorDinSpital);
    }
}