package Lesson9;
// Home
//  pushToIndex(int index, int data)
//  remove(int index)
//  get(int index)

public class MyLinkedList {
    private Node head;
    private int size;


    public MyLinkedList() {
        this.head = head = null;
        this.size = size = 0;

    }

    public void pushToTail(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            size++;
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
    }
    public Object get(int index)
    {
        if (index < 0)
            return null;
        Node curr = null;
        if (head != null) {
            curr = head.getNext();
            for (int i = 0; i < index; i++) {
                if (curr.getNext() == null)
                    return null;
                curr = curr.getNext();
            }
            return curr.getData();
        }
        return curr;
    }
    public void pushToIndex(int index, int data){
        Node node = head;
        Node prev = null;
        while (node != null && index > 0) {
            index--;
            prev = node;
            node = node.getNext();
        }
        Node nodeNew = new Node(data);
        nodeNew.setNext(node);
        if(prev == null){
            head = nodeNew;
            return;
        }
        prev.setNext(nodeNew);

    }
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

    public int size()
    {
        int size = 0;
        Node CurrNode = head;
        while(CurrNode.getNext() != null)
        {
            CurrNode = CurrNode.getNext();
            size++;
        }
        return size;
    }
    private Node getToIndex(int index) {
        if (index < 0 || size <= index) {
            throw new IndexOutOfBoundsException("is empty");
        }
        if (index == 0) {
            return head;
        }
        Node node = head.getNext();
        int i = 1;
        while (i < index) {
            node = node.getNext();
            ++i;
        }
        return node;
    }
}
