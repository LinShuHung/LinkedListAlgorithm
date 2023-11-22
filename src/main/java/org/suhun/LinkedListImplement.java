package org.suhun;

public class LinkedListImplement {

    class Node{
        int val;
        Node next;
        public Node(int value){
            this.val = value;
        }
    }

    private Node start;
    private Node end;

    public void add(int value){
        if(start == null){
            start = new Node(value);
            end = start;
        }else{
            end.next = new Node(value);
            end = end.next;
        }
    }

    public void printLinkedList(){
        if(start == null){
            System.out.println("No node to print!!!!");
        }else{
            Node node = start;
            while(true){
                if(node == null) return;
                System.out.println(node.val);
                node = node.next;
            }
        }
    }
}