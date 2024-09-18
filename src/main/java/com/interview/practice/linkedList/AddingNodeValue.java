package com.interview.practice.linkedList;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

// Define the LinkedList class
class LinkedList {
    Node head;

    // Method to add a node to the list
    void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to calculate the sum of all node values
    int sum() {
        int sum = 0;
        Node current = head;
        while (current != null) {
            sum += current.value;
            current = current.next;
        }
        return sum;
    }
}

// Main class to test the LinkedList implementation
public class AddingNodeValue {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sum = list.sum();
        System.out.println("Sum of all node values: " + sum);  // Output should be 15
    }
}