import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    static class LLNode {
        int data;
        LLNode next;

        public LLNode(int d) {
            data = d;
            next = null;
        }
    }

    static void displayLL(LLNode head){
        LLNode temp=head;
        while (temp!=null) 
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }
    }

    public static void main(String[] args) {

        LLNode l1 = new LLNode(100);
        LLNode l2 = new LLNode(200);
        LLNode l3 = new LLNode(400);
        LLNode l4 = new LLNode(500);
        LLNode l5 = new LLNode(300);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        System.out.println("SLL is created");
        displayLL(l1);


    }
}