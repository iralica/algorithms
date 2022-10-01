package Lesson8;

public class StackTaskTwo<Intejer> {
    public static void main(String[] args) {
     StackTaskTwo s = new StackTaskTwo();
     int [] arr = new int[]{18,19,29,15,16};
     System.out.println(arr);
     s.getMin();
     s.pop();
     s.getMin();
     s.pop();
    }
    private Stack<Integer> helper = new Stack();
    private int top = -1;
    private int minValue;
    private static int STACK_SIZE = 1000;
    private int[] arr = new int[STACK_SIZE];
    public boolean empty(){
        return top < 0;
    }
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
        return top;
    }
    public int getMin(){
       return minValue;
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
