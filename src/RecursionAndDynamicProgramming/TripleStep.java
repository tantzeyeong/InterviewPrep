package RecursionAndDynamicProgramming;

public class TripleStep {

    public static int solve(int steps) {
        if (steps < 0) {
            return 0;
        }
        if (steps == 0) {
            return 1;
        }
        return solve(steps - 1) + solve(steps - 2) + solve(steps - 3);
    }
}
