package ro.ase.cts.factory.clase;

public class SupaCiuperci extends Supa{
    public SupaCiuperci(float pret, float gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supa de ciuperci are ").append(super.toString());
        System.out.println(sb);
    }
}
