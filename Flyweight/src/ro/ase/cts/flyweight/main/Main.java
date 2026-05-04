package ro.ase.cts.flyweight.main;

import ro.ase.cts.flyweight.clase.Autobuz;
import ro.ase.cts.flyweight.clase.ManagerLinie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz101=new Autobuz("Mercedes", 1999, 50);
        Autobuz autobuz102=new Autobuz("Lada", 1989, 40);

        ManagerLinie manager=new ManagerLinie();
        manager.getLinie("romana", "universitate", 102).nrMaxPasageriLinie(autobuz102);
        manager.getLinie("pipera", "berceni", 101).descriereLinie(autobuz101);


    }
}