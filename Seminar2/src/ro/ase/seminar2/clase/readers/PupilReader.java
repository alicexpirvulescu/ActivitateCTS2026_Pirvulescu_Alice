package ro.ase.seminar2.clase.readers;

import ro.ase.seminar2.clase.Aplicant;
import ro.ase.seminar2.clase.Elev;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PupilReader extends AplicantiReader {

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (scanner.hasNext()) {
            Elev e = new Elev();
            super.citesteAplicant(scanner,e);
            int clasa = scanner.nextInt();
            e.setClasa(clasa);
            String tutore = scanner.next();
            e.setTutore(tutore);
            elevi.add(e);
        }

        scanner.close();
        return elevi;
    }
}
