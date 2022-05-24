package StacksAndQueues;

import java.util.Stack;

public class SortStack<T extends Comparable<T>> {
    public Stack<T> stack = new Stack<>();

    public void push(T value) {
        Stack<T> anotherStack = new Stack<>();
        while (!this.stack.isEmpty() && value.compareTo(this.stack.peek()) == 1) {
            anotherStack.push(this.stack.pop());
        }
        this.stack.push(value);
        while (!anotherStack.isEmpty()) {
            this.stack.push(anotherStack.pop());
        }
    }

    public T pop() {
        return this.stack.pop();
    }

    public T peek() {
        return this.stack.peek();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
}