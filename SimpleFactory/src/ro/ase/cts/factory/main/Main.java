package ro.ase.cts.factory.main;

import ro.ase.cts.factory.clase.MijlocTransport;
import ro.ase.cts.factory.clase.fabrica.Factory;
import ro.ase.cts.factory.clase.fabrica.TipTransport;

public class Main {
    public static void main(String[] args) {
        var fabricaTransport = new Factory();
        MijlocTransport autobuz = fabricaTransport.getMijlocTransport(TipTransport.Autobuz, "MAN", 102);
        autobuz.afiseazaTipTransport();
    }
}