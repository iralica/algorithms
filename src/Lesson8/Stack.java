package Lesson8;

public class Stack<Intejer> {
    private int top = -1;

    private static int STACK_SIZE = 1000;
    private int[] arr = new int[STACK_SIZE];

    public boolean empty(){
        return top < 0;
    }

    public int peek(){
        if(top < 0) {
            System.out.println("Stack is empty");
        return 0;
        }
        return arr[top];
    }

    public int pop(){
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        return arr[top--];
    }

    public void puch(int c){
        if(top < STACK_SIZE - 1){
            arr [++top] = c;
            System.out.println("added to stack " + c);
        } else {
            System.out.println("stack overflow");
        }
    }

    public void printStack(){
        for (int i = top; i >=0 ; i--) {
            System.out.print(" " + arr[i]);
        }
    }

}
