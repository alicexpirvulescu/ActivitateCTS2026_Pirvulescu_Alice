package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderPupil extends ReaderAplicanti{


    public ReaderPupil(String numeFisier) {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(super.numeFisier);
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
