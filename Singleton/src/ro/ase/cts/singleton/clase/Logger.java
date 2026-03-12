package ro.ase.cts.singleton.clase;

public class Logger {
    private int cod;
    private String sender;
    private String categorie;

    private static Logger instanta = null;

    private Logger(String sender, String categorie) {
        this.cod = 0;
        this.sender = sender;
        this.categorie = categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getCategorie() {
        return categorie;
    }

    public void afiseazaLog(String text){ //lucreaza cu sb
        System.out.println(this.sender + " " + this.cod + " " + this.categorie + " " + text);
        this.cod++;
    }

    public static Logger getInstance(String sender, String categorie) {
        if(instanta==null) {
            instanta = new Logger(sender, categorie);
        }
        return instanta;
    }
}

