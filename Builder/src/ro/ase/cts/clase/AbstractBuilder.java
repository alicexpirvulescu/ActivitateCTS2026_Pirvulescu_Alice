package ro.ase.cts.clase;

public interface AbstractBuilder {
       Internare build();
// n are logica sa fie in interfata
       AbstractBuilder setNume(String numePacient);
       AbstractBuilder setPatRabatabil(boolean patRabatabil);
       AbstractBuilder setAreHalat(boolean halat);
       AbstractBuilder setArePapuci(boolean papuciCamera);
       AbstractBuilder setAreMicDejun(boolean micDejun);
}
