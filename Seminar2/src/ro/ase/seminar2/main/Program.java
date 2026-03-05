package ro.ase.seminar2.main;

import ro.ase.seminar2.clase.Angajat;
import ro.ase.seminar2.clase.Aplicant;
import ro.ase.seminar2.clase.Elev;
import ro.ase.seminar2.clase.Student;
import ro.ase.seminar2.clase.readers.AngajatiReader;
import ro.ase.seminar2.clase.readers.AplicantiReader;
import ro.ase.seminar2.clase.readers.PupilReader;
import ro.ase.seminar2.clase.readers.StudentReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;



public class Program {

    public static void main(String[] args) throws FileNotFoundException {
        List<Aplicant> listaAngajati;
        AplicantiReader ra = new AngajatiReader();

        listaAngajati = ra.readAplicanti("angajati.txt");

        for(Aplicant aplicant:listaAngajati)
            System.out.println(aplicant);
    }

}
