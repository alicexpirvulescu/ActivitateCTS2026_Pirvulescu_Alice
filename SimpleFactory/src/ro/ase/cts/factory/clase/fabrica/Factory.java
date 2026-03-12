package ro.ase.cts.factory.clase.fabrica;

import ro.ase.cts.factory.clase.MijlocTransport;
import ro.ase.cts.factory.clase.mijlocTransport.Autobuz;
import ro.ase.cts.factory.clase.mijlocTransport.Tramvai;
import ro.ase.cts.factory.clase.mijlocTransport.Troleibuz;

public class Factory {

    public MijlocTransport getMijlocTransport(TipTransport tipTransport, String marca, int nrLinie) {
        switch (tipTransport) {
            case Autobuz -> {
                return new Autobuz(nrLinie, marca);
            }
            case Tramvai -> {
                return new Tramvai(nrLinie, marca);
            }
            case Troleibuz -> {
                return new Troleibuz(nrLinie, marca);
            }
            default -> {
                return null;
            }
        }
    }


}

