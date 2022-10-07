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
        //listApp.print(head);
        int value = listApp.getNode(head, 3);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.pushToTail(1);
        System.out.println(myLinkedList);
        myLinkedList.pushToIndex(1, 1);
        myLinkedList.pushToIndex(2, 8);
        myLinkedList.pushToIndex(3, 10);
        myLinkedList.pushToIndex(2, 6);

        myLinkedList.remove(0);

        System.out.println("The element is: " + myLinkedList.get(2));
    }

    private void print(Node node) {
        System.out.print("[");
        while (node != null) {
            if (node.getNext() == null) {
                System.out.print(node.getData() + "]");
                ;
            } else {
                System.out.print(node.getData() + ", ");
            }
            node = node.getNext();
        }
        System.out.println();
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
