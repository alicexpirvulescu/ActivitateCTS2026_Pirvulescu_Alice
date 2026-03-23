package ro.ase.cts.factory.clase;

public class Clatite extends Desert{
    public Clatite(float pret, float gramaj, int calorii) {
        super(pret, gramaj, calorii);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clatitele au ").append(super.toString());
        System.out.println(sb);
    }
}
