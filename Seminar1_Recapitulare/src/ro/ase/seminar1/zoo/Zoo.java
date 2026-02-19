package ro.ase.seminar1.zoo;

import ro.ase.seminar1.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume;
    List<Animal> animale;
    ZooKeeper zooKeeper;


    public void feedAllAnimals(){
        for(Animal animal:animale){
            zooKeeper.feedAnimal(animal);
        }

    }

    public Zoo(String nume, ZooKeeper zooKeeper) {
        this.nume = nume;
        this.zooKeeper = zooKeeper;
        this.animale=new ArrayList<>();
    }

    public void adaugaAnimal(Animal animal){
        animale.add(animal);
    }
}