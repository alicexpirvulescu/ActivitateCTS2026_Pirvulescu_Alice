package ro.ase.cts.chain.clase;

public class CalatorieTroleibuz extends CalatorieHandler{
    public void setHandler(CalatorieHandler succesor) {
        this.succesor = succesor;
    }

    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta<3){
            return "Troleibuz";
        }
        return super.succesor.recomandaCalatorie(distanta);

    }
}