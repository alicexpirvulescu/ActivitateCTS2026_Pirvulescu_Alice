package ro.ase.cts.chain.main;

import ro.ase.cts.chain.clase.*;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler calatorieAutobuz=new CalatorieAutobuz();
        CalatorieHandler calatorieTroleibuz=new CalatorieTroleibuz();
        CalatorieHandler calatorieTramvai=new CalatorieTramvai();
        CalatorieHandler calatorieMetrou=new CalatorieMetrou();

        calatorieTroleibuz.setHandler(calatorieAutobuz);
        calatorieAutobuz.setHandler(calatorieTramvai);
        calatorieTramvai.setHandler(calatorieMetrou);

        System.out.println(calatorieAutobuz.recomandaCalatorie(10));
        System.out.println(calatorieAutobuz.recomandaCalatorie(2));
        System.out.println(calatorieAutobuz.recomandaCalatorie(7));
    }
}