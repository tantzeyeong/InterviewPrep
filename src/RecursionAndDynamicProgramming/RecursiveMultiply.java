package RecursionAndDynamicProgramming;

public class RecursiveMultiply {

    public static int solve(int num1, int num2) {
        int n1, n2;
        if (num1 >= num2) {
            n1 = num1;
            n2 = num2;
        } else {
            n1 = num2;
            n2 = num1;
        }
        return solveHelper(n1, n2);
    }

    public static int solveHelper(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        int n2 = (int) (Math.log(num2) / Math.log(2));
        return (num1 << n2) + solveHelper(num1, (num2 - (int) Math.pow(2, n2)));
    }
}
