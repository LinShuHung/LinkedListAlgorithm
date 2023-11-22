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

    public void search(int value){
        int count = 1;
        if(start == null){
            System.out.println("No node to search!!!!");
        }else{
            Node node = start;
            while(true){
                if(node == null) break;
                if(node.val == value){
                    System.out.println("The value "+ value + " is in it!Total find "+ count+" times!!!");
                    break;
                }else{
                    node = node.next;
                }
                count++;
            }
            System.out.println("-----No Result! Total find " + count + " times----");
        }
    }

    public void delete(int value){
        if(start == null){
            System.out.println("No node to delete!!!");
        }else{
            Node node = start;
            Node preNode = null;
            Node targetNode = null;

            while(true){
                if(node == null) break;

                if(node.val == value){
                    targetNode = node;
                    break;
                }else{
                    preNode = node;
                    node = node.next;
                }
            }

            if(targetNode != null){
                if(targetNode == start){
                    start = start.next;
                }else{
                    preNode.next = targetNode.next;
                }
            }
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
