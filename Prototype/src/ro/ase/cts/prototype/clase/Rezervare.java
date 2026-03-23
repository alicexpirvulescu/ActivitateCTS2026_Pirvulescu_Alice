package ro.ase.cts.prototype.clase;

public class Rezervare implements RezervareAbstracta{
    private String numeClient;
    private int oraRezervare;
    private int ziuaRezervare;
    private String numarTelefon;

    public Rezervare(String numeClient, int oraRezervare, int ziuaRezervare,
                     String numarTelefon) {
        if(numeClient.length() >1){
            this.numeClient = numeClient;
        } else {
            this.numeClient = "Ion";
        }
        this.ziuaRezervare=ziuaRezervare;

        this.oraRezervare = oraRezervare;

        if(numarTelefon.length() == 10 ){
            this.numarTelefon=numarTelefon;
        } else {
            this.oraRezervare = 0700000000;
        }
    }

    public void setOraRezervare(int oraRezervare) {
        if(oraRezervare<23 && oraRezervare>9 ){
            this.oraRezervare = oraRezervare;
        } else {
            this.oraRezervare = 9;
        }
    }

    public void setZiuaRezervare(int ziuaRezervare) {
        if(ziuaRezervare<30){
            this.ziuaRezervare=ziuaRezervare;
        } else {
            this.ziuaRezervare=1;
        }
    }

    private Rezervare(){

    }


    @Override
    public RezervareAbstracta clone() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.oraRezervare = this.oraRezervare;
        rezervareNoua.ziuaRezervare = this.ziuaRezervare;
        rezervareNoua.numarTelefon = this.numarTelefon;

        return rezervareNoua;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", ziuaRezervare=").append(ziuaRezervare);
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

