/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctci_linkedlist;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author ajinkyawani
 */
public class CTCI_LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node head = new Node(5);
        head.appendToTail(6);
        head.appendToTail(7);
        head.appendToTail(8);
        head.appendToTail(9);
        head.appendToTail(6);
        
        //Scanner input = new Scanner(System.in);

        int choice = 0;
        //choice = new Integer();
        while (choice != 7) {
            System.out.println("\n Please enter your choice");
            System.out.println("\n"
                    + "1. Print Linked List."
                    + "\n2. Remove Duplicates."
                    + "\n3. Remove Duplicates Without Using any Buffer."
                    + "\n4. Return Kth To Last Element."
                    + "\n5. Partition the List."
                    + "\n6. Sum of Two Linked Lists."
                    + "\n7. Exit");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    head.printLinkedList();
                    break;
                case 2:
                    head.removeDuplicates();
                    break;
                case 3:
                    head.removeDuplicatesWithoutBuffer();
                    break;
                case 4:
                    System.out.println("\nEnter index of the Kth to last element to find out.");
                    Scanner input = new Scanner(System.in);
                    int index = input.nextInt();
                    Node kthNode = head.returnKthToLastElement(index);
                    System.out.println("\n Kth To Last Element:" + kthNode.data);
                    break;
                case 5:
                    System.out.println("\nEnter the partition value.");
                    Scanner partitionInput = new Scanner(System.in);
                    int partitionValue = partitionInput.nextInt();
                    head = head.partitionList(partitionValue);
                    break;
                case 6:
                    Node list1 = new Node(7);
                    list1.appendToTail(1);
                    list1.appendToTail(6);
                    Node list2 = new Node(5);
                    list2.appendToTail(9);
                    list2.appendToTail(2);
                    Node result = list1.sumTwoLists(list1, list2);
                    result.printLinkedList();
                case 7:
                    exit(0);
            }
        }

    }

}
