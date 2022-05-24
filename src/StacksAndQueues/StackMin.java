package StacksAndQueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackMin {
    private Stack<Integer> stack;
    private List<Integer> array;

    public StackMin() {
        this.stack = new Stack<>();
        this.array = new ArrayList<>();
    }
    public void push(int num) {
        if (stack.size() == 0 || num < this.min()) {
            array.add(num);
        } else {
            array.add(this.min());
        }
        this.stack.add(num);
    }

    public int pop() {
        return this.stack.pop();
    }

    public int min() {
        return this.array.get(stack.size() - 1);
    }
}
