package ro.ase.cts.clase;

public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNume(String numePacient);
    AbstractBuilder setPatRabatabil(boolean patRabatabil);
    AbstractBuilder setHalat(boolean halat);
    AbstractBuilder setArePapuci(boolean papuciCamera);
    AbstractBuilder setAreMicDejun(boolean micDejun);
}
