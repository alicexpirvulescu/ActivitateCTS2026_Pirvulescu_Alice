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
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input2.hasNext()) {
            Angajat a = new Angajat();
            super.citesteAplicant(input2, a);
            int salariu = input2.nextInt();
            a.setSalariu(salariu);
            String ocupatie = input2.next();
            a.setOcupatie(ocupatie);

            angajati.add(a);
        }
        input2.close();
        return angajati;
    }
}
