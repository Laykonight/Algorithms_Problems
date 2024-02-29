package Data_Structures;

/*
Question
1. Implement the following function:

public static void sortStackAscending(Stack<Integer> stackToSort) {
    Stack<Integer> aux = new Stack<Integer>();
}

Example of expected functionality:
Stack before: [34, 3, 31, 98, 92, 23]
Stack after: [3, 23, 31, 34, 92, 98]
*/

import java.util.Stack;

public class SortStack {
    public static void sortStackAscending (Stack<Integer> stackToSort){
        Stack<Integer> aux = new Stack<>();
        while (!stackToSort.isEmpty()){
            int temp = stackToSort.pop();
            while (!aux.isEmpty() && temp > aux.peek()){
                stackToSort.push(aux.pop());
            }
            aux.push(temp);
        }
        while (!aux.isEmpty()){
            stackToSort.push(aux.pop());
        }
    }

    public static void printStack (Stack<Integer> stack){
        Stack<Integer> aux = new Stack<>();
        while (!stack.isEmpty()){
            int temp = stack.pop();
            System.out.println(temp);
            aux.push(temp);
        }
        while (!aux.isEmpty()){
            stack.push(aux.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(6);
        System.out.println("before sort:");
        printStack(stack);
        System.out.println("----\nafter sort:");
        sortStackAscending(stack);
        printStack(stack);
    }

}
