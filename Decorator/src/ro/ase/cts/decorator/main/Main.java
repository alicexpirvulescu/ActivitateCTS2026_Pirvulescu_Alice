package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.clase.*;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata = new NotaDePlata(13, "13.04.2026");
        notaDePlata.printeaza();

        int a=2;
        NotaDePlataDecorator notaDePlataDecorator;
        if(a == 1){
            notaDePlataDecorator = new NotaDePlataNoulAn(notaDePlata);
        }
        else{
            notaDePlataDecorator = new NotaDePlata1Mai(notaDePlata);
        }

        notaDePlataDecorator.printeaza();
        notaDePlataDecorator.printeazaFelicitare();
    }
}