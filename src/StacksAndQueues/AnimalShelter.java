package StacksAndQueues;

import java.util.LinkedList;

public class AnimalShelter {
    LinkedList<Pair<Cat, Integer>> cats;
    LinkedList<Pair<Dog, Integer>> dogs;

    public static int age = 0;

    public AnimalShelter() {
        cats = new LinkedList<>();
        dogs = new LinkedList<>();
    }

    public void enqueue(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cats.add(new Pair<>(cat, age));
            age++;
        } else {
            Dog dog = (Dog) animal;
            dogs.add(new Pair<>(dog, age));
            age++;
        }
    }

    public Animal dequeueAny() {
        if (dogs.size() == 0 && cats.size() == 0) {
            return null;
        } else if (dogs.size() == 0) {
            return (Animal) cats.remove().getFirst();
        } else if (cats.size() == 0) {
            return (Animal) dogs.remove().getFirst();
        } else if (dogs.peekFirst().getSecond() < cats.peekFirst().getSecond()) {
            return (Animal) dogs.remove().getFirst();
        } else {
            return (Animal) cats.remove().getFirst();
        }
    }

    public Cat dequeueCat() {
        if (cats.size() != 0) {
            return cats.remove().getFirst();
        } else {
            return null;
        }
    }

    public Dog dequeueDog() {
        if (dogs.size() != 0) {
            return dogs.remove().getFirst();
        } else {
            return null;
        }
    }
}



