package ro.ase.cts.main;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.ReaderAngajati;
import ro.ase.cts.clase.readers.ReaderAplicanti;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		Aplicant.setPragPunctaj(85);
		try {
			ReaderAplicanti ra=new ReaderAngajati("angajati.txt");
			listaAngajati = ra.readAplicanti();
			for(Aplicant aplicant:listaAngajati) {
				System.out.println(aplicant.toString());
				aplicant.afisareVenit();
				aplicant.afisareStatut();
			}
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
	}

}
