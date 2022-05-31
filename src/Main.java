import ArraysAndStrings.*;
//import LinkedLists.*;
import StacksAndQueues.*;
import TreesAndGraphs.*;
import TreesAndGraphs.RouteBetweenNodes;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static <Bst> void main(String[] args) {
//        int[][] matrix = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}
//        };
//
//        int[][] matrix2 = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        int[][] matrix3 = {
//                {0, 1, 1, 1},
//                {1, 1, 1, 1},
//                {1, 1, 0, 1},
//                {1, 1, 1, 1}
//        };
//
//        int[][] matrix4 = {
//                {1, 1, 1, 0},
//                {1, 4, 5, 1},
//        };
//
//        AnimalShelter animalShelter = new AnimalShelter();
//        Dog dog1 = new Dog("dog1");
//        Dog dog2 = new Dog("dog2");
//        Dog dog3 = new Dog("dog3");
//        Dog dog4 = new Dog("dog4");
//        Dog dog5 = new Dog("dog5");
//        Cat cat1 = new Cat("cat1");
//        Cat cat2 = new Cat("cat2");
//        Cat cat3 = new Cat("cat3");
//        Cat cat4 = new Cat("cat4");
//        Cat cat5 = new Cat("cat5");
//        animalShelter.enqueue(dog1);
//        animalShelter.enqueue(cat5);
//        animalShelter.enqueue(dog2);
//        animalShelter.enqueue(cat4);
//        animalShelter.enqueue(dog3);
//        animalShelter.enqueue(cat3);
//        animalShelter.enqueue(dog4);
//        animalShelter.enqueue(cat2);
//        animalShelter.enqueue(dog5);
//        animalShelter.enqueue(cat1);
////        for (int i = 0; i < 10; i++) {
////            System.out.println(animalShelter.dequeueAny().name);
////        }
//        for (int i = 0; i < 6; i++) {
//            System.out.println(animalShelter.dequeueCat());
//        }
//        for (int i = 0; i < 6; i++) {
//            System.out.println(animalShelter.dequeueDog());
//        }
//        System.out.println(animalShelter.dequeueAny());
//        RouteBetweenNodes map = new RouteBetweenNodes();
//        map.addNode();
//        map.addNode();
//        map.addNode();
//        map.addNode();
//        map.addNode();
//
//
//        map.addNeighbour(0, 1);
//        map.addNeighbour(0, 2);
//        map.addNeighbour(1, 2);
//        map.addNeighbour(2, 4);
//        map.addNeighbour(3, 4);
//
//        System.out.println(map.solve(0, 3));
//        ListOfDepths<Integer> listOfDepths = new ListOfDepths<>();
//        CheckBalanced<Integer> test = new CheckBalanced<>();
//        List<Integer> list = new ArrayList<>();
//        list.add(0);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
////        list.add(6);
//        BST<Integer> bst = MinimalTree.solve(list);
////        bst.printing();
////        List<LinkedList<Integer>> res = listOfDepths.solve(bst);
////        for (int i = 0; i < res.size(); i++) {
////            LinkedList<Integer> lists = res.get(i);
////            for (int j = 0; j < lists.size(); j++) {
////                System.out.print(lists.get(j) + " ");
////            }
////            System.out.println();
////        }
//        System.out.println(test.findHeight(bst.root));
//        System.out.println(test.solve(bst));
        Node<Integer> node0 = new Node<>(0);
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        node0.left = node1;
        node1.left = node2;
        BST<Integer> bst = new BST<>(node0);
        System.out.println(CheckBalanced.solve(bst));
    }
}
