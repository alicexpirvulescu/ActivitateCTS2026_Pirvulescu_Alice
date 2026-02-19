package ro.ase.seminar1.main;

import ro.ase.seminar1.animal.Tigru;
import ro.ase.seminar1.zoo.Zoo;
import ro.ase.seminar1.zoo.ZooKeeper;
import ro.ase.seminar1.animal.Lion;
import ro.ase.seminar1.animal.Zebra;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("Gica");
        Zoo gradinaZoo = new Zoo("Gradina Zoo", zooKeeper);
        Lion lion=new Lion("Leu", 4, 100);
        Zebra zebra=new Zebra("Zebra", 5, 200);

        gradinaZoo.adaugaAnimal(lion);
        gradinaZoo.adaugaAnimal(zebra);
        gradinaZoo.adaugaAnimal(new Tigru("Tigru", 2, "Bengalez"));
        gradinaZoo.feedAllAnimals();
    }
}