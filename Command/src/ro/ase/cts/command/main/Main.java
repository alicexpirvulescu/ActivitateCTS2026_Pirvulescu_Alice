package ro.ase.cts.command.main;

import ro.ase.cts.command.clase.Autobuz;
import ro.ase.cts.command.clase.Command;
import ro.ase.cts.command.clase.Operator;
import ro.ase.cts.command.clase.Plecare;

public class Main {
    public static void main(String[] args) {
        Operator operator=new Operator();
        Command c1=new Plecare(new Autobuz("Mercedes"), 168);
        Command c2=new Plecare(new Autobuz("Volkswagen"), 331);

        operator.adaugaComanda(c1);
        operator.adaugaComanda(c2);
        operator.adaugaComanda(new Plecare(new Autobuz("Mercedes"), 226));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}