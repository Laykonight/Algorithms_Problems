package Data_Structures;

/*
Question
1. Implement the following function:

public static void sortStackAscending(Stack<Integer> stackToSort) {
    Stack<Integer> aux = new Stack<Integer>();
}

*Example of expected functionality:
Stack before: [34, 3, 31, 98, 92, 23]
Stack after: [3, 23, 31, 34, 92, 98]*

2. How could this be done without an auxiliary stack? (no need to implement)
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

}
