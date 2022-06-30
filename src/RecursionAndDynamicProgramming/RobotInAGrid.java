package RecursionAndDynamicProgramming;

import StacksAndQueues.Pair;

import java.util.Stack;

public class RobotInAGrid {

    public static void solve(Integer[][] map) {
        int rows = map.length;
        int columns = map[0].length;

        boolean[][] visited = new boolean[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                visited[i][j] = false;
            }
        }
        int x = 0;
        int y = 0;
        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        stack.add(new Pair<>(0, 0));

        while (!stack.isEmpty()) {
            x = stack.peek().getFirst();
            y = stack.peek().getSecond();

            if (x == columns - 1 && y == rows - 1) {
                break;
            } else if (y + 1 != rows && !visited[x][y + 1] && map[x][y + 1] != 1) {
                stack.add(new Pair<>(x, y + 1));
                visited[x][y + 1] = true;
                map[x][y + 1] = 10;
//                System.out.println(map[x][y + 1]);
            } else if (x + 1 != columns && !visited[x + 1][y] && map[x + 1][y] != 1) {
                stack.add(new Pair<>(x + 1, y));
                visited[x + 1][y] = true;
                map[x + 1][y] = 10;
//                System.out.println(map[x + 1][y]);
            } else {
                stack.pop();
            }
        }
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.print(map[i][j]);
//                if (j != columns - 1) {
//                    System.out.print(", ");
//                }
//            }
//            System.out.println();
//        }
        while (!stack.isEmpty()) {
            x = stack.peek().getFirst();
            y = stack.peek().getSecond();
            stack.pop();
            map[x][y] = 5;
        }
//        return map;
    }
}
