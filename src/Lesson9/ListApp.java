package Lesson9;

public class ListApp {
    public static void main(String[] args) {
        // 1 - 2 - 3 - 4 -5
        Node node5 = new Node(5);
        Node node4 = new Node(4);
        Node node3 = new Node(3);
        Node node2 = new Node(2);
        Node node1 = new Node(1);
        Node head = new Node(0);

        ListApp listApp = new ListApp();
        listApp.print(head);
        int value = listApp.getNode(head, 3);

        MyLinkedList myLinkedList = new MyLinkedList();
    }

    private void print(Node node){
        while (node!= null){
            System.out.println(node.getData() + " ");
            node = node.getNext();
        }
    }

    private int getNode(Node node, int number){
        if (number == 1 && node == null){
            //
        }
        while (node!= null && number > 1){
            node = node.getNext();
            number--;
        }

        return 0;
    }
}