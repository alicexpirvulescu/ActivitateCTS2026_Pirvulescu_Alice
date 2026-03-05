package ro.ase.seminar2.clase.readers;

import ro.ase.seminar2.clase.Aplicant;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantiReader {
    public abstract List<Aplicant> readAplicanti(String file) throws FileNotFoundException;

    public void citesteAplicant(Scanner scanner, Aplicant aplicant) {
        String nume = scanner.next();
        aplicant.setNume(nume);

        String prenume = (scanner.next()).toString();
        aplicant.setPrenume(prenume);

        int varsta = Integer.valueOf(scanner.nextInt());
        aplicant.setVarsta(varsta);

        int punctaj = Integer.valueOf(scanner.nextInt());
        aplicant.setPunctaj(punctaj);
        int nr = Integer.valueOf(scanner.nextInt());
        String[] denumiriProiecte = new String[nr];
        for (int i = 0; i < nr; i++)
            denumiriProiecte[i] = scanner.next();
        aplicant.setNr_proiecte(nr, denumiriProiecte);

    }

}
