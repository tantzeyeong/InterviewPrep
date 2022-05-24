package StacksAndQueues;

import java.util.Stack;

public class QueueViaStacks<T> {
    public Stack<T> firstStack = new Stack<>();
    public Stack<T> secondStack = new Stack<>();

    public void shiftStack() {
        if (secondStack.isEmpty()) {
            while (!firstStack.isEmpty()) {
                secondStack.push(firstStack.pop());
            }
        }
    }

    public void push(T value) {
        firstStack.push(value);
    }

    public T pop() {
        shiftStack();
        return secondStack.pop();
    }

    public T peek() {
        shiftStack();
        return secondStack.peek();
    }

    public int size() {
        return firstStack.size() + secondStack.size();
    }
}
