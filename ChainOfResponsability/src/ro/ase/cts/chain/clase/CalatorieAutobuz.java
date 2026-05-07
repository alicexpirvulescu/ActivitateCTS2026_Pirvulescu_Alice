package ro.ase.cts.chain.clase;

public class CalatorieAutobuz extends CalatorieHandler{
    public void setHandler(CalatorieHandler succesor) {
        this.succesor = succesor;
    }

    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta<5){
            return "Autobuz";
        }
        return super.succesor.recomandaCalatorie(distanta);
    }
}
