package Data_Structures.Libraries_Implementations;

import java.util.EmptyStackException;
import java.util.Stack;

public class MaxStack1 {
    private final Stack<Integer> values;
    private final Stack<Integer> max;

    public MaxStack1(){
        this.values = new Stack<>();
        this.max = new Stack<>();
        this.max.push(Integer.MIN_VALUE);
    }

    public void add(int value){
        values.push(value);
        if (value >= max.peek()){
            max.push(value);
        }
    }

    public int pop(){
        if (values.isEmpty()){
            throw new EmptyStackException();
        }
        if (max.peek().equals(values.peek())){
            max.pop();
        }
        return values.pop();
    }

    public int peek(){
        return values.peek();
    }

    public int getMax(){
        return max.peek();
    }
}
