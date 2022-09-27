package Lesson8;

public class StackApp {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.puch(10);
        stack.puch(5);
        stack.puch(15);
        stack.printStack();
        stack.pop();
        System.out.println("\n" + "___________");
        stack.printStack();
        stack.peek();

    }
}
