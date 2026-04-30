package ro.ase.cts.composite.main;

import ro.ase.cts.composite.clase.Departament;
import ro.ase.cts.composite.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura depSpital=new Departament("Spital");
        Structura depAdministrativ=new Departament("Administrativ");
        Structura depSecretariat=new Departament("Secretariat");
        Structura depManagement=new Departament("Management");

        ((Departament) depSpital).adaugaStructura(depAdministrativ);
        ((Departament) depSpital).adaugaStructura(depManagement);
        ((Departament) depAdministrativ).adaugaStructura(depSecretariat);

        depSpital.afiseazaDetaliiStructura();

        ((Departament) depSpital).stergeStructura(depManagement);
        ((Departament) depAdministrativ).adaugaStructura(depManagement);
    }
}