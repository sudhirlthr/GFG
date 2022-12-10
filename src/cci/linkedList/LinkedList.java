package cci.linkedList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedList {
    private Node node;
    public LinkedList(int data){
        this.node = new Node(data);
    }
    public void appendNode(int data){
        this.node.appendNode(data);
    }
    public void printLinkedList(){
        Node head = this.node;
        while (head != null){
            System.out.println("Data: "+head.data);
            head = head.next;
        }
    }
    public void deleteMiddleNode(){
        Node head = this.node;
        Node middleNode = findMiddleNode();
        Node prev = null;
        while (head != middleNode){
            prev = head;
            head = head.next;
        }
        prev.next = head.next;
    }
    public int getMiddleNodeData(){
        Node middleNode = findMiddleNode();
        return middleNode.data;
    }

    private Node findMiddleNode() {
        Node slow = this.node;
        Node fast = this.node;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public void removeDuplicates(){
        Node head = this.node;
        Set<Integer> nodeSet = new LinkedHashSet<>();
        while (head.next != null){
            nodeSet.add(head.data);
            head = head.next;
        }
        final LinkedList[] linkedList = {new LinkedList(Integer.MIN_VALUE)};
        nodeSet.forEach(integer -> {
            if (linkedList[0].node.data == Integer.MIN_VALUE) linkedList[0] = new LinkedList(integer);
            else linkedList[0].appendNode(integer);
        });
        this.node = linkedList[0].node;
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
    void appendNode(int data){
        Node end = new Node(data);
        Node n = this;
        while (n.next != null ){
            n = n.next;
        }
        n.next = end;
    }
}