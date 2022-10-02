package Lesson9;

public class ListApp {
    public static void main(String[] args) {
        // 1 - 2 - 3 - 4 -5
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        Node head = new Node(0, node1);

        ListApp listApp = new ListApp();
        listApp.print(head);
        int value = listApp.getNode(head, 3);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.pushToTail(36);
        myLinkedList.pushToTail(15);
        myLinkedList.pushToTail(20);
        //myLinkedList.pushToIndex(1, 1);
        //myLinkedList.pushToIndex(2, 8);

        //myLinkedList.pushToIndex(3, 10);
        //myLinkedList.pushToIndex(2, 6);

        myLinkedList.print();
        myLinkedList.remove(2);

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
