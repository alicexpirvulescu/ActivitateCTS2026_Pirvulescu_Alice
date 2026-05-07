package ro.ase.cts.strategy.main;

import ro.ase.cts.strategy.clase.ProbaScrisa;
import ro.ase.cts.strategy.clase.Student;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Cristina");

        student.setModSustinere(new ProbaScrisa());
        student.examinare();
    }
}