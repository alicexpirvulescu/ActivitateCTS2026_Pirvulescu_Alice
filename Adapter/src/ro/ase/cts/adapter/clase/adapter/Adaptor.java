package ro.ase.cts.adapter.clase.adapter;


import ro.ase.cts.adapter.clase.farmacie.Medicament;

public class Adaptor extends Medicament {
    private ro.ase.cts.adapter.clase.spital.Medicament medSpital;

    public Adaptor(ro.ase.cts.adapter.clase.spital.Medicament medSpital) {
        super(medSpital.getNume());
        this.medSpital = medSpital;
    }

    @Override
    public void cumparaMedicament()
    {
        medSpital.achizitioneazaMedicament();
    }
}