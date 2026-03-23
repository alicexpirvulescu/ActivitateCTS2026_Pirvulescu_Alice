package ro.ase.cts.clase;

public class InternareBuilder01 implements AbstractBuilder{
    private String numePacient;
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halat;
    public InternareBuilder01() {
        patRabatabil = false;
        micDejun=false;
        papuciCamera=false;
        halat=false;
        numePacient="Pop";
    }

    @Override
    public Internare build() {
        return new Internare(numePacient, patRabatabil, micDejun, papuciCamera, halat);
    }

    @Override
    public AbstractBuilder setNume(String numePacient) {
        this.setNume(numePacient);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean patRabatabil) {
        this.setPatRabatabil(patRabatabil);
        return this;
    }

    @Override
    public AbstractBuilder setHalat(boolean halat) {
        this.setHalat(halat);
        return this;
    }

    @Override
    public AbstractBuilder setArePapuci(boolean papuciCamera) {
        this.setArePapuci(papuciCamera);
        return this;
    }

    @Override
    public AbstractBuilder setAreMicDejun(boolean micDejun) {
        this.setAreMicDejun(micDejun);
        return this;
    }
}
