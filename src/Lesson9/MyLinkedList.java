package Lesson9;

public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
        this.head = head = null;
        this.size = size = 0;
    }

    public void pushToTail (int data){
        Node node = new Node(data, null);

        if(head == null){
            head = node;
            size++;
            return;
        }
        Node curr = head;
        while (curr.getNext() != null){
            curr = curr.getNext();
        }
        curr.setNext();
    }

   /*public void pushToIndex(int index, int data) {
        Node node = new Node(data, null);
        if (head == null && index != 0) {
            return;
        }
        head = node;

     if (head != null && index == 0) {
         node.setNext() = head;
         head = node;
         return;
        }
        Node current = head;
        Node previous = null;

        int i = 0;

        while (i < index) {
            previous = current;
            current = node.getNext();

            if (current == null) {
                break;
            }

            i++;
        }
        node.getNext() = current;
        previous.getNext() = node;
    }*/

    public boolean removeFirst(){
        if(head == null){
            return false;
        }
        Node curr = head;
        head = curr.getNext();
        curr.setNext();
        return true;
    }
    public void remove(int index) {
        if (index<0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("List index out of bounds");
        if (index == 0) {
            head = head.getNext();
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.getNext();
            }
            curr.setNext();
        }
        size--;
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
            prev.setNext();
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
    // Home
    //  pushToIndex(int index, int data)
    //  remove(int index)
    //  get(int index)



}
