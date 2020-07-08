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
    
}
