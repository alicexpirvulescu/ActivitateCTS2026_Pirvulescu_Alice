package ro.ase.seminar2.clase.readers;

import ro.ase.seminar2.clase.Angajat;
import ro.ase.seminar2.clase.Aplicant;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantiReader {

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (scanner.hasNext()) {
            Angajat a = new Angajat();
            super.citesteAplicant(scanner, a);
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
