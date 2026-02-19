package ro.ase.seminar1.animal;

public class Lion extends Animal {
    private int greutate;

    public Lion(String name, int age, int greutate) {
        super(name, age);
        this.greutate = greutate;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Leul a mancat "+mancare);
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("Leul: ");
        buffer.append(super.toString());
        buffer.append("greutate = ");
        buffer.append(this.greutate);
        return buffer.toString();
    }
}