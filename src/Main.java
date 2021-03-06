import ArraysAndStrings.*;
//import LinkedLists.*;
import RecursionAndDynamicProgramming.PowerSet;
import RecursionAndDynamicProgramming.RecursiveMultiply;
import RecursionAndDynamicProgramming.RobotInAGrid;
import RecursionAndDynamicProgramming.TripleStep;
import StacksAndQueues.*;
import TreesAndGraphs.*;
import TreesAndGraphs.RouteBetweenNodes;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

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
//        list.add(6);
//        BST<Integer> bst = MinimalTree.solve(list);
//        bst.printing();
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
//        Node<Integer> node0 = new Node<>(0);
//        Node<Integer> node1 = new Node<>(1);
//        Node<Integer> node2 = new Node<>(2);
//        node0.left = node1;
//        node1.left = node2;
//        BST<Integer> bst = new BST<>(node0);
//        System.out.println(CheckBalanced.solve(bst));
//        System.out.println(ValidateBST.solve(bst));

//        NodeWithParent<Integer> node0 = new NodeWithParent<>(0);
//        NodeWithParent<Integer> node1 = new NodeWithParent<>(1);
//        NodeWithParent<Integer> node2 = new NodeWithParent<>(2);
//        NodeWithParent<Integer> node3 = new NodeWithParent<>(3);
//        NodeWithParent<Integer> node4 = new NodeWithParent<>(4);
//        NodeWithParent<Integer> node5 = new NodeWithParent<>(5);
//        NodeWithParent<Integer> node6 = new NodeWithParent<>(6);
//        NodeWithParent<Integer> node7 = new NodeWithParent<>(7);
//        NodeWithParent<Integer> node8 = new NodeWithParent<>(8);
//        NodeWithParent<Integer> node9 = new NodeWithParent<>(9);
//        NodeWithParent<Integer> node10 = new NodeWithParent<>(10);
//        NodeWithParent<Integer> node11 = new NodeWithParent<>(11);
//        NodeWithParent<Integer> node12 = new NodeWithParent<>(12);
//
//
//        node9.left = node1;
//        node1.parent = node9;
//
//        node1.left = node0;
//        node0.parent = node1;
//
//        node1.right = node4;
//        node4.parent = node1;
//
//        node4.left = node3;
//        node3.parent = node4;
//
//        node4.right = node6;
//        node6.parent = node4;
//
//        node3.left = node2;
//        node2.parent = node3;
//
//        node6.left = node5;
//        node5.parent = node6;
//
//        node6.right = node7;
//        node7.parent = node6;
//
//        node7.right = node8;
//        node8.parent = node7;
//
//        node9.right = node11;
//        node11.parent = node9;
//
//        node11.left = node10;
//        node10.parent = node11;
//
//        node11.right = node12;
//        node12.parent = node11;
//
//
//        System.out.println(Successor.solve(node12));

//        List<List<Integer>> adjacencyList = new ArrayList<>(5);
//        List<Integer> node0 = Arrays.asList(2, 4);
//        List<Integer> node1 = Arrays.asList(2);
//        List<Integer> node2 = Arrays.asList();
//        List<Integer> node3 = Arrays.asList(0, 1);
//        List<Integer> node4 = Arrays.asList(2);
//
//        adjacencyList.add(node0);
//        adjacencyList.add(node1);
//        adjacencyList.add(node2);
//        adjacencyList.add(node3);
//        adjacencyList.add(node4);
////        adjacencyList.add(node5);
//        List<Integer> res = BuildOrder.solve(adjacencyList);
//        for (int i = 0; i < res.size(); i++) {
//            System.out.println(res.get(i));
//        }
//    }
//        Node<Integer> node0 = new Node<>(0);
//        Node<Integer> node1 = new Node<>(1);
//        Node<Integer> node2 = new Node<>(2);
//        Node<Integer> node3 = new Node<>(3);
//        Node<Integer> node4 = new Node<>(4);
//        Node<Integer> node5 = new Node<>(5);
//        Node<Integer> node6 = new Node<>(6);
//        Node<Integer> node7 = new Node<>(7);
//        Node<Integer> node8 = new Node<>(8);
//        Node<Integer> node9 = new Node<>(9);
//        Node<Integer> node10 = new Node<>(10);
//
//
//        node0.left = node1;
//        node0.right = node2;
//
//        node1.left = node3;
//        node1.right = node4;
//
//        node2.left = node5;
//        node2.right = node6;
//
//        node3.right = node9;
//
//        node4.left = node7;
//        node4.right = node8;
//
//        node7.left = node10;
//
//        Node<Integer> node11 = new Node<>(2);
//        Node<Integer> node12 = new Node<>(5);
//        Node<Integer> node13 = new Node<>(6);
//
//        node11.left = node12;
//        node11.right = node13;
//
//        BST<Integer> BST1 = new BST<>(node0);
//        BST<Integer> BST2 = new BST<>(node11);
//
//        System.out.println(CheckSubtree.solveRecursively(BST1, BST2));

//        System.out.println(TripleStep.solve(20));


//        Integer[][] grid = {{0, 0, 0, 1}, {0, 1, 0, 1}, {0, 0, 1, 1}, {0, 0, 0, 0}};
//
//        int row = grid.length;
//        int col = grid.length;
//        System.out.println("Initial Grid: ");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(grid[i][j]);
//                if (j != col - 1) {
//                    System.out.print(", ");
//                }
//            }
//            System.out.println();
//        }
//        RobotInAGrid.solve(grid);
//        System.out.println("\nTraversed Grid: ");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(grid[i][j]);
//                if (j != col - 1) {
//                    System.out.print(", ");
//                }
//            }
//            System.out.println();
//        }

//        List<Integer> test = Arrays.asList(1, 2, 3, 4);
//
//        List<List<Integer>> ans = PowerSet.solve(test);
//        for (int i = 0; i < ans.size(); i++) {
//            System.out.println(ans.get(i).toString());
//        }

        System.out.println(RecursiveMultiply.solve(15, 15));
    }
}
