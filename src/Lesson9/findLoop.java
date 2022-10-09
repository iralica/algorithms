package Lesson9;
//Написать метод, который будет проверять наличие цикла в связном спиcке.(возвращает true или false)
// Как понять это есть цикл ? Для данной задачи, цикл - когда последний элемент связного списка ссылается не на null,
// а на какой либо предыдущий элемент. Пример : Список без цикла : // 1 - 2 -3 - 4 - 5
// Список с циклом : // 1 - 2 -3 - 4 - 5 - 3 Список задать можно задать отдельными нодами, как делали на уроке.
// Решение сделать с пространственной сложностью O(1)
public class findLoop {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        linkedList.head.next = node1;
        node1.next = node2;
        node2.next = node3;
        //node3.next = null;
        node3.next = node2;

        boolean loop = linkedList.checkLoop();
        if(loop) {
            System.out.println("\nThere is a loop in LinkedList.");
        }
        else {
            System.out.println("\nThere is no loop in LinkedList.");
        }
    }

    static class LinkedList {
        public Lesson9.Node head;
        static class Node {
            int value;
            Lesson9.Node next; // подключить каждый узел к следующему узлу
            Node(int d) {
                value = d;
                next = null;
            }
        }
        public boolean checkLoop() {
            Lesson9.Node first = head;         //создать две ссылки в начале листа
            Lesson9.Node second = head;

            while(first != null && first.next !=null) {
                first = first.next.next;            // переместить первую ссылку на 2 узла
                second = second.next;               // переместить вторую ссылку на 1 узел
                if(first == second) {               // если две ссылки встречаются тогда есть петля
                    return true;
                }
            }
            return false;
        }

    }
}
