package Lesson8;

public class StackTaskTwo<Intejer> {
    public static void main(String[] args) {
     StackTaskTwo s = new StackTaskTwo();
        StackTaskTwo s1 = new StackTaskTwo();
     s.puch(16);
     s.puch(15);
     s.puch(29);
     s.puch(19);
     s.puch(18);
     System.out.println(s);
     s1.pop();
     System.out.println(s1.getMin());

    }
    private Stack<Integer> helper = new Stack();
    private Stack<Integer> minEl = new Stack();

    public void puch(int top){
        int min = top;

        if(!minEl.empty() && min > minEl.peek()) {
            min = minEl.peek();
        }
        helper.puch(top);
        minEl.puch(min);
    }
    public void pop(){
        helper.pop();
        minEl.pop();
    }
    public int getMin(){
       return minEl.peek();
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
