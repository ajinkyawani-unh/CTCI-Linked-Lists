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
        while (choice != 6) {
            System.out.println("\n Please enter your choice");
            System.out.println("\n"
                    + "1. Print Linked List."
                    + "2. Remove Duplicates."
                    + "3. Remove Duplicates Without Using any Buffer."
                    + "4. Return Kth To Last Element."
                    + "5. Partition the List."
                    + "6. Exit");
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
                    exit(0);
            }
        }

    }

}
