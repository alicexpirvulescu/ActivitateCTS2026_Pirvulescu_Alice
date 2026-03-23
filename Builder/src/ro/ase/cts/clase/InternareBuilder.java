package ro.ase.cts.clase;

public class InternareBuilder implements AbstractBuilder{
    private Internare internare;

    public InternareBuilder(String numePacient) {
        internare = new Internare(numePacient,
                false, false, false, false);
    }
    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNume(String numePacient) {
        this.internare.setNumePacient(numePacient);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean patRabatabil) {
        this.internare.setPatRabatabil(patRabatabil);
        return this;
    }

    @Override
    public AbstractBuilder setAreHalat(boolean halat) {
        this.internare.setHalat(halat);
        return this;
    }

    @Override
    public AbstractBuilder setArePapuci(boolean papuciCamera) {
        this.internare.setPapuciCamera(papuciCamera);
        return this;
    }

    @Override
    public AbstractBuilder setAreMicDejun(boolean micDejun) {
        this.internare.setMicDejun(micDejun);
        return this;
    }
}
