package Data_Structures;

import java.util.EmptyStackException;
import java.util.Stack;

public class MaxStack1 {
    private final Stack<Integer> values;
    private final Stack<Integer> max;

    public MaxStack1(){
        this.values = new Stack<>();
        this.max = new Stack<>();
        this.max.add(Integer.MIN_VALUE);
    }

    public void add(int value){
        values.add(value);
        if (value >= max.peek()){
            max.add(value);
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
