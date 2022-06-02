package TreesAndGraphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BuildOrder {

    public static List<Integer> solve(List<List<Integer>> adjacencyList) {
        int size = adjacencyList.size();
        List<Boolean> visited = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            visited.add(false);
        }
        for (int i = 0; i < adjacencyList.size(); i++) {
            if (!visited.get(i)) {
                solveHelper(adjacencyList, visited, stack, adjacencyList.get(i), i);
            }
        }
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        if (res.size() != size) {
            return null;
        }
        return res;
    }

    public static void solveHelper(List<List<Integer>> adjacencyList, List<Boolean> visited, Stack<Integer> stack, List<Integer> dependency, int node) {
        visited.set(node, true);
        for (int i = 0; i < dependency.size(); i++) {
            int num = dependency.get(i);
            if (!visited.get(num)) {
                solveHelper(adjacencyList, visited, stack, adjacencyList.get(num), num);
            }
        }
        stack.push(node);
    }
}
