package Data_Structures.Libraries_Implementations.Max_Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class MaxStack2 {
    private final Stack<Node> maxStack;

    public MaxStack2(){
        this.maxStack = new Stack<>();
        maxStack.push(new Node(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
    public void add(int value){
        Node temp = maxStack.peek();
        if (value > temp.currentMax){
            maxStack.push(new Node(value, value));
            return;
        }
        maxStack.push(new Node(value, temp.currentMax));
    }
    public int pop(){
        if (1 < maxStack.size()) {
            Node temp = maxStack.pop();
            return temp.value;
        }
        throw new EmptyStackException();
    }
    public int peek(){
        Node temp = maxStack.peek();
        return temp.value;
    }

    public int getMax(){
        Node temp = maxStack.peek();
        return temp.currentMax;
    }

    private static class Node{
        Integer value;
        Integer currentMax;

        public Node(int value, int currentMax){
            this.value = value;
            this.currentMax = currentMax;
        }
    }
}
