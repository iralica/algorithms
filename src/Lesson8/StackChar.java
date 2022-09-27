package Lesson8;

public class StackChar {
    private static int STACK_SIZE = 1000;
    private int top = -1;

    private char [] arr = new char[STACK_SIZE];


    public boolean empty() {

        return top < 0;
    }
    public void push(char c){
        if (top < STACK_SIZE - 1) {
            arr[++top] = c;
            //System.out.println("Element has been added to stack");
        } else {
            System.out.println("Stack overflow");
        }
    }

    public char peek () {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        return arr[top];
    }

    public char pop(){
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        return arr[top--];
    }

    public void printStack() {
        System.out.print("[");
        for (int i = top; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i] + "]");
            }
        }
    }
}
