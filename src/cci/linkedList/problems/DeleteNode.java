package cci.linkedList.problems;
import cci.linkedList.LinkedList;

public class DeleteNode {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(10);
        list.appendNode(20);
        list.appendNode(30);
        list.appendNode(40);
        list.appendNode(50);
        list.appendNode(60);
        list.appendNode(70);
        list.appendNode(40);

        list.printLinkedList();
        System.out.println("Middle node element: "+list.getMiddleNodeData());

        list.deleteMiddleNode();
        System.out.println("Nodes after middle node deletion");
        list.printLinkedList();

        list.removeDuplicates();
        System.out.println("Nodes after removing duplicate nodes");
        list.printLinkedList();
    }
}
