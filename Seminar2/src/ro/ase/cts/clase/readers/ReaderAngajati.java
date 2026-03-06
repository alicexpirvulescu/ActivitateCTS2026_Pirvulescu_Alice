package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderAngajati extends ReaderAplicanti {

    public ReaderAngajati(String numeFisier) {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(super.numeFisier));
        scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Angajat a=new Angajat();

            super.citesteAplicant(scanner,a);
            int salariu = scanner.nextInt();
            a.setSalariu(salariu);
            String ocupatie = scanner.next();
            a.setOcupatie(ocupatie);
            angajati.add(a);
        }
        scanner.close();
        return angajati;
    }
}
