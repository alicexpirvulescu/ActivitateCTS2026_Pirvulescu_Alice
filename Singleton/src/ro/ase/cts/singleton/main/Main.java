package ro.ase.cts.singleton.main;

import ro.ase.cts.singleton.clase.Logger;

public class Main {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance("Interfata", "afisare");
        log1.afiseazaLog("fis json nu este afisat corect");
        log1.afiseazaLog("eroare");
        Logger log2 = Logger.getInstance("Backend", "baza de date");
        log2.afiseazaLog("eroare");
        //cum afisam pe backend? cu setter
        log2.setCategorie("baza de date");
        log2.setSender("Backend");
        log2.afiseazaLog("Eroare la inserare");
    }
}
