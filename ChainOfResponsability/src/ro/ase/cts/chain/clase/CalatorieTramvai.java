package ro.ase.cts.chain.clase;

public class CalatorieTramvai extends CalatorieHandler{
    public void setHandler(CalatorieHandler succesor) {
        this.succesor = succesor;
    }

    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta<10){
            return "Tramvai";
        }
        return super.succesor.recomandaCalatorie(distanta);

    }
}