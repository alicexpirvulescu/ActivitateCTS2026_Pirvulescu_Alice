package ro.ase.seminar2.clase;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int an_studii;

    public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte,
                   String[] denumireProiect, String facultate, int an_studii) {
        super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
        this.facultate = facultate;
        this.an_studii = an_studii;
    }

    public Student() {
        super();

    }
    public int finantare() {
//        int s=20;
//        System.out.println("Studentul "+getNume()+" "+getPrenume()+" primeste"+s+" Euro/zi in proiect.");
//        return s;
        return 20;
    }

    public String getFacultate() {
        return facultate;
    }
    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }
    public int getAn_studii() {
        return an_studii;
    }
    public void setAn_studii(int an_studii) {
        this.an_studii = an_studii;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Studentul: ");
        buffer.append(super.toString());
        buffer.append("facultate= ");
        buffer.append(this.facultate);
        buffer.append("an de studiu: ");
        buffer.append(this.an_studii);
        return buffer.toString();
    }

}