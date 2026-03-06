package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static float sumaFinantata=30;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
				int nrProiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public Elev() {
		super();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Elevul: ");
		sb.append(super.toString());
		sb.append(", varsta=").append(varsta);
		sb.append(", punctaj=").append(punctaj);
		sb.append(", nrProiecte=").append(nrProiecte);
		sb.append(", denumireProiect=").append(Arrays.toString(denumireProiect));
		return sb.toString();
	}
	
	public void afisareVenit() {
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+Elev.sumaFinantata+" Euro/zi in proiect.");

	}
	
}
