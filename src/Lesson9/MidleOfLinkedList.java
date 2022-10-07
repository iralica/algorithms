package Lesson9;

public class MidleOfLinkedList {
    public static void main(String[] args) {
        Node node5 = new Node(5);
        Node node4 = new Node(4);
        Node node3 = new Node(3);
        Node node2 = new Node(2);

        Node head = new Node(0);

        MidleOfLinkedList midleOfLinkedList = new MidleOfLinkedList();
        System.out.println(midleOfLinkedList.getMinValue(head));
    }
    // time O(n/2)
    // space O(1)
    private int getMinValue(Node head){
        if(head == null){
            return -1;
        }
        Node slow = head;
        Node fast = head;
        while ((fast != null && fast.getNext() != null)){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return  slow.getData();
    }
    // time O(n)
    // space O(n)
    public static int middle(Node node, int n, int[] arr)
    {
        if (node == null)
            return n+1;
        int d = middle(node.getNext(), ++n, arr);
        if (d / 2 == n && d != -1) {
            arr[0] = node.getData();
            return -1;
        }
        return d;
    }

}
