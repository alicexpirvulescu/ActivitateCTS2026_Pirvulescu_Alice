package ro.ase.cts.decorator.clase;

public class NotaDePlata implements NotaDePlataAbstract{
    private float suma;
    private String data;

    public NotaDePlata(float suma, String data) {
        this.suma = suma;
        this.data = data;
    }

    @Override
    public void printeaza() {
        System.out.println("La data " + this.data + " a fost platita suma de " + this.suma);
    }
}