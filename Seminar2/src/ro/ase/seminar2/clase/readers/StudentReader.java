package ro.ase.seminar2.clase.readers;

import ro.ase.seminar2.clase.Aplicant;
import ro.ase.seminar2.clase.Student;
import ro.ase.seminar2.clase.readers.AplicantiReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantiReader {

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (scanner.hasNext()) {
            Student s = new Student();

            super.citesteAplicant(scanner,s);
            int an_studii = scanner.nextInt();
            s.setAn_studii(an_studii);

            String facultate = (scanner.next()).toString();
            s.setFacultate(facultate);

            studenti.add(s);
        }
        scanner.close();
        return studenti;
    }
}
