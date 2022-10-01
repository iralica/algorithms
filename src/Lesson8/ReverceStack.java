package Lesson8;

public class ReverceStack {

    public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.puch(5);
    s.puch(8);
    s.puch(9);
    s.puch(15);
    System.out.println("Before");
    s.printStack();
    reverse(s);
    System.out.println("\n After");
    s.printStack();
    }
       static void insert_at_bottom(Stack helper, int x)
    {
        if (helper.empty())
            helper.puch(x);
        else {
            int top = helper.pop();
            insert_at_bottom(helper, x);
            helper.puch(top);
        }
    }
    static void reverse(Stack helper) {
        if (helper.empty()) {return;
        }
        int x = helper.pop();
        reverse(helper);
        insert_at_bottom(helper, x);
        }

}
