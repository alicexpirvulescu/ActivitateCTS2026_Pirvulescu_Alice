package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.clase.*;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport autobuz168=new Autobuz(23, 168);
        MijlocDeTransport autobuz226=new Autobuz(23, 226);

        Statie statieRomana=new Statie("Piata Romana", 10);
        Statie statieUniversitate=new Statie("Universitate", 0);

        autobuz168.opresteInStatie(statieRomana);
        autobuz226.opresteInStatie(statieUniversitate);

        MijlocDeTransport autobuzNoapte168=new AutobuzDeNoapte(autobuz168);
        MijlocDeTransport autobuzNoapte226=new AutobuzDeNoapte(autobuz226);

        System.out.println("------------------------------------------");

        autobuzNoapte168.opresteInStatie(statieRomana);
        autobuzNoapte226.opresteInStatie(statieUniversitate);

        System.out.println("--------------------------------------------");

        MijlocDeTransport auto168=new Autobuz(30, 168, TipCursa.SPECIALA);
        MijlocDeTransport autobuzSpecial168=new AutobuzCursaSpeciala(auto168);
        autobuzSpecial168.opresteInStatie(statieRomana);
    }
}