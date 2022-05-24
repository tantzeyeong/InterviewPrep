package StacksAndQueues;

import java.util.ArrayList;
import java.util.List;

public class StackOfPlates<T> {
    private int size;

    private int orderIndex = 0;
    private int index = -1;
    private List<List<T>> order = new ArrayList<>();

    public StackOfPlates(int size) {
        this.size = size;
        order.add(new ArrayList<T>());
    }

    public void push(T value) {
        this.index += 1;
        if (this.index >= size - 1) {
            order.get(orderIndex).add(value);
            if (orderIndex <= this.size() - 1) {
                orderIndex += 1;
            } else {

            }
            orderIndex += 1;
            order.set(orderIndex, new ArrayList<T>());
            index = 0;
        } else {
            order.get(orderIndex).add(value);
        }
    }

    public T pop() {
        T temp;
        if (this.index == 0) {
            temp = order.get(orderIndex).get(index);
            index = size - 1;
            orderIndex -= 1;
        } else {
            temp = order.get(orderIndex).get(index);
            index -= 1;
        }
        return temp;
    }

    public int size() {
        return order.size();
    }
}
