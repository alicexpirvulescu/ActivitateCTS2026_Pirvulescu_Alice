package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static float sumaFinantata=10;

	public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte,
				   String[] denumireProiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();

	}

	public static float getSumaFinantata() {
		return sumaFinantata;
	}

	public static void setSumaFinantata(float sumaFinantata) {
		Angajat.sumaFinantata = sumaFinantata;
	}

	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Angajatul: ");
		sb.append(super.toString());
		sb.append(" ocupatie ");
		sb.append(this.ocupatie);
		sb.append(" salariu ");
		sb.append(this.salariu);
		return sb.toString();
	}
	
	
	public void afisareVenit() {
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+Angajat.sumaFinantata+" Euro/zi in proiect.");

	}
	
}
