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

        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (input.hasNext()) {
            Student s = new Student();

            super.citesteAplicant(input,s);
            int an_studii = input.nextInt();
            s.setAn_studii(an_studii);

            String facultate = (input.next()).toString();
            s.setFacultate(facultate);

            studenti.add(s);
        }
        input.close();
        return studenti;
    }
}
