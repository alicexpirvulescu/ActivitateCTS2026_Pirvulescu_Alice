package ro.ase.seminar1.zoo;

import ro.ase.seminar1.animal.Animal;

public class ZooKeeper {
    private String nume;

    public ZooKeeper(String nume) {
        this.nume = nume;
    }

    public Animal feedAnimal(Animal animal)
    {
        System.out.println("Zookeeper-ul " +nume+ " a hranit animalul "+animal.toString());
        animal.eat("Mancare");
        return animal;
    }
}
