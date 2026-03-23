package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare r1 = new Rezervare("gICA", 20, 21, "0767611668" );
        Rezervare r2 = (Rezervare) r1.clone();
//incalcam dependency inversion
        r2.setZiuaRezervare(10);
        r2.setOraRezervare(10);
//respectam dependency
        //     ((Rezervare)r2).setZiuaRezervare(10);
        //     ((Rezervare)r2).setZiuaRezervare(10);
        System.out.println(r1.toString());
        System.out.println(r2.toString());

    }
}
