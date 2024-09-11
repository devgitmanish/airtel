package com.interview.practice.linkedList;


public class LinkedListExe {

    Node head;

    class Node {

        String data;
        Node previous;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirstNode(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLastNode(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void printList() {

        /* corner case if head is null */
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    public void printList(Node head) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    /* reverse a linkedList with recursion */
    public void printListInReverseWithRecursion(Node node) {
        if (node == null) {
            return;
        }
        printListInReverseWithRecursion(node.next);
        System.out.print(node.data + " ->");
    }

    public void printListInReverseWithRecursion() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        printListInReverseWithRecursion(head);
        System.out.println("null");
    }

    /* reverse a linkedList without recursion */
    private Node reverseListWithOutRecursion(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public void printListInReverseWithOutRecursion() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        // Step 1: Reverse the linked list
        head = reverseListWithOutRecursion(head);
        // Step 3: Reverse the linked list again to restore original order
        printList(head);
        //head = reverseListWithOutRecursion(head);
    }

    public void deleteFirstNode() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLastNode() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        /* Only one node */
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    public void deletenth(int n) {
        if (head == null) {
            return;
        } else {
            Node current = head;
            int pos = n;
            for (int i = 1; i < pos; i++) {
                current = current.next;
            }
            if (current == head) {
                head = current.next;
            } else if (current == null) {
                current = current.previous;
            } else {
                current.previous.next = current.next;
                current.next.previous = current.previous;
            }
            //Delete the middle node
            current = null;
        }
    }

    public static void main(String[] args) {
        LinkedListExe list = new LinkedListExe();
        list.addFirstNode("name");
        list.addFirstNode("my");
        list.addFirstNode("is");
        list.addFirstNode("this");

        //list.addLastNode("list");

        //list.addFirstNode("this");
        //list.printList();

        //list.deleteFirstNode();
        //list.printList();

        //list.deleteLastNode();
        list.printList();
        //list.printListInReverse();
        list.printListInReverseWithOutRecursion();
    }
}

