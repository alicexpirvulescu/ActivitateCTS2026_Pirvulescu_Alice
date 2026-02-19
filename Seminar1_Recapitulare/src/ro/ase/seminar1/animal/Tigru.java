package ro.ase.seminar1.animal;

public class Tigru extends Animal {
    private String rasa;

    public Tigru(String name, int age, String rasa) {
        super(name, age);
        this.rasa = rasa;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Tigrul a mancat " + mancare);
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(" Tigrul: ");
        buffer.append(super.toString());
        buffer.append("rasa = ");
        buffer.append(this.rasa);
        return buffer.toString();
    }
}