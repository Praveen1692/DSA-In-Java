public class Main {

    static Node head = null;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    static void deleteAtPos(int pos) {
        Node temp = head;
        if (temp == null) {
            return;
        }
        if (pos == 0) {
            head = temp.next;
            return;

        }

        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null && temp.next != null) {
            return;
        }
        temp.next = temp.next.next;

    }

    public static void main(String[] args) {
        System.out.println("Hello");

        insertAtEnd(100);
        insertAtEnd(200);
        insertAtEnd(300);
        insertAtEnd(100);
        insertAtEnd(200);
        insertAtEnd(300);
        deleteAtPos(2);

        print(); // Output: 100 200 300
    }
}
