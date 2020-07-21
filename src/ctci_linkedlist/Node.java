/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctci_linkedlist;

import java.util.HashSet;

/**
 *
 * @author ajinkyawani
 */
public class Node {
    Node next = null;
    int data;
    
    public Node(int data){
     this.data = data;   
    }
    
    public void appendToTail(int data){
        Node end = new Node(data);
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }
    
    public void printLinkedList(){
        Node head = this;
        System.out.println("\n");
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    
    public void removeDuplicates(){
        Node previous = null;
        Node head = this;
        HashSet<Integer> set = new HashSet<Integer>();
        while(head != null){
            if(set.contains(head.data)){
                previous.next = head.next;
            }
            else{
                set.add(head.data);
                previous = head;
            }
            head = head.next;
        }
    }
    
    public void removeDuplicatesWithoutBuffer() {
        Node current = this;
        //Node runner = this.next;
        
        while(current != null){
            Node runner = current;
            while(runner.next != null){
                if(current.data == runner.next.data){
                    runner.next = runner.next.next;
                }
                else
                    runner = runner.next;
            }
            current = current.next;
            
        }
    }
    
    public Node returnKthToLastElement(int k) {
        Node p1 = this;
        Node p2 = this;
        
        for(int i = 0; i < k; i++){
            if (p1 == null) return null;
            p1 = p1.next;
        }
        
        while(p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
    
    public Node partitionList(int value) {
        Node head = this;
        Node tail = this;
        Node node = this;
        
        while(node != null){
            Node next = node.next;
            if(node.data < value){
                node.next = head;
                head = node;
            }
            else {
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;
        return head;
    }
    
    public Node sumTwoLists(Node list1, Node list2) {
        Node resultNodeHead = null;
        int multiplier = 1;
        int list1Num = 0;
        int list2Num = 0;
        while(list1 != null){
            list1Num = list1Num + list1.data * multiplier;
            list2Num = list2Num + list2.data * multiplier;
            list1 = list1.next;
            list2 = list2.next;
            multiplier = multiplier * 10;
        }
        int sum = list1Num + list2Num;
        
        for(int i = 0; i < 3; i++){
            int data = sum % 10;
            sum = sum / 10;
            if (resultNodeHead == null)
                resultNodeHead = new Node(data);
            else
                resultNodeHead.appendToTail(data);
        }
        return resultNodeHead;
    }
    
    public Node reverseList(Node list){
        Node head = null;
        while(list != null){
            Node n = new Node(list.data);
            n.next = head;
            head = n;
            list = list.next;        
        }
        return head;
    }
    
    public boolean ifPalindrome(Node list1, Node list2){
        if(list1 != null && list2!= null){
            while(list1 != null){
                if(list1.data != list2.data)
                    return false;
                list1 = list1.next;
                list2 = list2.next;
            }
        }
        else
            return list1 == null && list2 == null;
        return true;
    }
    
    
}
