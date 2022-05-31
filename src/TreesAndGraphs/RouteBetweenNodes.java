package TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RouteBetweenNodes {
    List<LinkedList<Integer>> adjacencyList = new ArrayList<>();

    public void addNode() {
        LinkedList<Integer> newList = new LinkedList<>();
        adjacencyList.add(newList);
    }

    public void addNeighbour(int num, int neighbour) {
        adjacencyList.get(num).add(neighbour);
    }

    public boolean solve(int start, int end) {
        if (start == end) {
            return true;
        }
        boolean[] visited = new boolean[adjacencyList.size()];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            LinkedList<Integer> linkedList = adjacencyList.get(node);
            if (node == end) {
                return true;
            }
            for (int i = 0; i < linkedList.size(); i++) {
                if (!visited[linkedList.get(i)]) {
                    queue.add(linkedList.get(i));
                    visited[node] = true;
                }
            }
        }
        return false;
    }
}
