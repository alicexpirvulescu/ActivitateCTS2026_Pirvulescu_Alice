package ro.ase.cts.factory.fabrici;

import ro.ase.cts.factory.clase.FelMancare;
import ro.ase.cts.factory.enums.TipMancare;

public interface FabricaAbstracta {
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj);
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii);
}
