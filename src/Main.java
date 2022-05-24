import ArraysAndStrings.*;
import LinkedLists.*;
import StacksAndQueues.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix3 = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1}
        };

        int[][] matrix4 = {
                {1, 1, 1, 0},
                {1, 4, 5, 1},
        };

        AnimalShelter animalShelter = new AnimalShelter();
        Dog dog1 = new Dog("dog1");
        Dog dog2 = new Dog("dog2");
        Dog dog3 = new Dog("dog3");
        Dog dog4 = new Dog("dog4");
        Dog dog5 = new Dog("dog5");
        Cat cat1 = new Cat("cat1");
        Cat cat2 = new Cat("cat2");
        Cat cat3 = new Cat("cat3");
        Cat cat4 = new Cat("cat4");
        Cat cat5 = new Cat("cat5");
        animalShelter.enqueue(dog1);
        animalShelter.enqueue(cat5);
        animalShelter.enqueue(dog2);
        animalShelter.enqueue(cat4);
        animalShelter.enqueue(dog3);
        animalShelter.enqueue(cat3);
        animalShelter.enqueue(dog4);
        animalShelter.enqueue(cat2);
        animalShelter.enqueue(dog5);
        animalShelter.enqueue(cat1);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(animalShelter.dequeueAny().name);
//        }
        for (int i = 0; i < 6; i++) {
            System.out.println(animalShelter.dequeueCat());
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(animalShelter.dequeueDog());
        }
        System.out.println(animalShelter.dequeueAny());
    }
}
