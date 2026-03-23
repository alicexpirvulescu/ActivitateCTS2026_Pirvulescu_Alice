package ro.ase.cts.factory.main;

import ro.ase.cts.factory.clase.FelMancare;
import ro.ase.cts.factory.enums.TipDesert;
import ro.ase.cts.factory.enums.TipSupa;
import ro.ase.cts.factory.fabrici.FabricaDesert;
import ro.ase.cts.factory.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaDesert fabricaDesert = new FabricaDesert();
        FabricaSupa fabricaSupa = new FabricaSupa();

        FelMancare supaCiuperci = fabricaSupa.getFelMancare(TipSupa.CIUPERCI, 15.5f, 300.0f);
        FelMancare supaLegume = fabricaSupa.getFelMancare(TipSupa.LEGUME, 15.0f, 300.0f);

        FelMancare clatite = fabricaDesert.getFelMancare(TipDesert.CLATITE, 20.0f, 500.0f, 500);
        FelMancare papanasi = fabricaDesert.getFelMancare(TipDesert.PAPANASI, 20.0f, 500.0f, 500);

        supaLegume.afisare();
        supaCiuperci.afisare();
        clatite.afisare();
        papanasi.afisare();
    }
}