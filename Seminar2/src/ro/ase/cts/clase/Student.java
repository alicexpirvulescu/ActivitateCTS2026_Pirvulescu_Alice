package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	private static float sumaFinantata=10;


	public Student(String nume, String prenume, int varsta, int punctaj,
				   int nrProiecte, String[] denumireProiect, String facultate, int anStudii) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiect);
		this.facultate = facultate;
		this.an_studii = anStudii;
	}

	public Student() {
		super();

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
			StringBuilder buffer = new StringBuilder();
			buffer.append("Studentul ");
			buffer.append(super.toString());
			buffer.append("facultate ");
			buffer.append(this.facultate);
			buffer.append("an studii ");
			buffer.append(this.an_studii);
			return buffer.toString();
	}
	
	
	public void afisareVenit() {
		System.out.println("Studentul "+getNume()+" "+getPrenume()+" primeste"+Student.sumaFinantata+" Euro/zi in proiect.");

	}
	
}
