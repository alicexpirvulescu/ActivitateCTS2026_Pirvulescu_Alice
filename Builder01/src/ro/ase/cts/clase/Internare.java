package ro.ase.cts.clase;

public class Internare {
    private String numePacient;
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halat;

    public Internare(){
        patRabatabil = false;
        micDejun=false;
        papuciCamera=false;
        halat=false;
        numePacient="Pop";
    }

    public Internare(String numePacient, boolean patRabatabil, boolean micDejun, boolean papuciCamera,
                     boolean halat) {
        this.numePacient = numePacient;
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciCamera = papuciCamera;
        this.halat = halat;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public boolean isMicDejun() {
        return micDejun;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public boolean isPapuciCamera() {
        return papuciCamera;
    }

    public void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }

    public boolean isHalat() {
        return halat;
    }

    public void setHalat(boolean halat) {
        this.halat = halat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pacientul ");
        sb.append(this.numePacient);
        sb.append(" are pat rabatabil: ");
        sb.append(this.patRabatabil);
        sb.append(", mic dejun: ");
        sb.append(this.micDejun);
        sb.append(", papuci de camera: ");
        sb.append(this.papuciCamera);
        sb.append(" si halat: ");
        sb.append(this.halat);
        return sb.toString();
    }
}
