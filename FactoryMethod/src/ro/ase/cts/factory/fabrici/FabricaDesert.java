package ro.ase.cts.factory.fabrici;

import ro.ase.cts.factory.clase.Clatite;
import ro.ase.cts.factory.clase.FelMancare;
import ro.ase.cts.factory.clase.Papanasi;
import ro.ase.cts.factory.enums.TipDesert;
import ro.ase.cts.factory.enums.TipMancare;

public class FabricaDesert implements FabricaAbstracta{
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        return getFelMancare(tipMancare, pret, gramaj, 500);
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        if(tipMancare== TipDesert.PAPANASI){
            return new Papanasi(pret, gramaj, calorii);
        } else if (tipMancare== TipDesert.CLATITE){
            return new Clatite(pret, gramaj, calorii);
        }
        return null;
    }
}
