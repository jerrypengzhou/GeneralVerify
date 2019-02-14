package com.general.verified.arithmetic;

class Node {
    public Node next;
    private int point;
    Node(){};
    Node(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }
}
class reverseListMain {
    public static void main(String[] args) {
        reverseList rl = new reverseList();
        Node node = rl.listNode1;
        rl.createNodeList();
        while ( node != null){
            System.out.println(node.getPoint());
            node = node.next;
        }
        rl.reverseRecursion(rl.listNode1);
        Node node10 = rl.listNode10;
        while ( node10 != null){
            System.out.println(node10.getPoint());
            node10 = node10.next;
        }
    }
}

public class reverseList {
    public Node listNode1 = new Node(1);
    public Node listNode2 = new Node(2);
    public Node listNode3 = new Node(3);
    public Node listNode4 = new Node(4);
    public Node listNode5 = new Node(5);
    public Node listNode6 = new Node(6);
    public Node listNode7 = new Node(7);
    public Node listNode8 = new Node(8);
    public Node listNode9 = new Node(9);
    public Node listNode10 = new Node(10);

    public void reverseRecursion(Node listNode) {
        if (listNode == null || listNode.next == null) {
            return;
        }
        Node secondNode = listNode.next;
        reverseRecursion(secondNode);
        secondNode.next = listNode;
        listNode.next = null;
    }

    public void reverseForeach(Node listNode) {
        Node first = listNode;
        Node temp = null;
        while(first.next != null){
            Node second = first.next;
            first.next = temp;
            temp = second;
            second.next = first;
            first = second;
        }
    }

    public void createNodeList() {
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode9;
        listNode9.next = listNode10;
    }
}
