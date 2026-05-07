package ro.ase.cts.strategy.clase;

public class Student {
    private String numeStudent;
    private ModSustinereExamen modSustinere;

    public void setModSustinere(ModSustinereExamen modSustinere) {
        this.modSustinere = modSustinere;
    }

    public Student(ModSustinereExamen modSustinere) {
        this.modSustinere = modSustinere;
    }

    public Student() {
        this.modSustinere=new ProbaGrila();
    }

    public void examinare(){
        modSustinere.sustinereExamen();
    }

    public Student(String numeStudent) {
        this.numeStudent = numeStudent;
    }
}