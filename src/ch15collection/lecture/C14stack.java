package ch15collection.lecture;
import java.util.Stack;

public class C14stack {
    public static void main(String[] args) {
        /*stack(LIFO: Last in first Out)
        * Commonly used methods:
        * push: adding items at the end
        * pop: taking the last item out
        * peek : search for last item
        * */

        Stack<Integer> stack = new Stack<>();
        stack.push(9);
        stack.push(8);
        stack.push(3);

        System.out.println("stack.size() = " + stack.size());

        Integer popped = stack.pop();

        System.out.println("popped = " + popped);
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());

        System.out.println("stack.size() = " + stack.size());
    }
}
