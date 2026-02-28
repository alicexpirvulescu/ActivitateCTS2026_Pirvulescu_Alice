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
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input2.hasNext()) {
            Elev e = new Elev();
            super.citesteAplicant(input2,e);
            int clasa = input2.nextInt();
            e.setClasa(clasa);
            String tutore = input2.next();
            e.setTutore(tutore);
            elevi.add(e);
        }

        input2.close();
        return elevi;
    }
}
