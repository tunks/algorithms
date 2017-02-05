//
// Node.java
// Created by Lihao on 2/4/17.

public class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    public Node appendTail(Node head, int d) {
        Node newNode = new Node(d);
        if (head == null) {
            return newNode;
        }
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = newNode;
        return head;
    }

    public void printList(Node head) {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}