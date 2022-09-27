package Lesson8;

public class StackTaskTwo {
    public static void main(String[] args) {
     StackTaskTwo s = new StackTaskTwo();
     int [] arr = new int[]{18,19,29,15,16};
     System.out.println(arr);
     s.getMin();
     s.pop();
     System.out.println("\n ___________________");
     s.printStack();
     System.out.println("\n ___________________");
     s.getMin();

    }
    private Stack<Integer> helper = new Stack();
    private int top = -1;
    private static int STACK_SIZE = 1000;
    private int[] arr = new int[STACK_SIZE];

    public void puch(int top){
        if(helper.empty()){
            helper.puch(top);
            System.out.println("added to stack " + top);
        } else {
            int min = Math.min(helper.peek(), top);
            helper.puch(min);
        }
    }

    public int pop(){
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        return arr[top--];
    }
    public int getMin(){
        puch(arr[top]);
        return helper.peek();
    }
    public void printStack(){
        for (int i = top; i >=0 ; i--) {
            System.out.print(" " + arr[i]);
        }
    }


    // 18 19 29 15 16
    // getMin() - 15;
    // pop()
    // 18 19 29 15
    // getMin () - 15
    // pop ()
    // 18 19 29
    // getMin () 18

    // 16 15 29 19 18
    // getMin() - 15;
    // pop ()
    // 16 15 29 19

}
