package Lesson9;

public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
        this.head = head = null;
        this.size = size = 0;
    }

    public void pushToTail (int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            size++;
            return;
        }
        Node curr = head;
        while (curr.getNext() != null){
            curr = curr.getNext();
        }
        curr.setNext(node);
    }
    public boolean removeFirst(){
        if(head == null){
            return false;
        }
        Node curr = head;
        head = curr.getNext();
        curr.setNext(null);
        return true;
    }

    public boolean removeLast(){
        if(head == null){
            return false;
        }
        Node curr = head;
        Node prev = null;
        while (curr.getNext() != null){
            prev = curr;
            curr = curr.getNext();

        }
        if (prev != null){
            prev.setNext(null);
        }
        return true;
    }
    public void print(){
        Node curr = head;
        while (curr!= null){
            System.out.println(curr.getData() + " ");
            curr = curr.getNext();
        }
    }

}
