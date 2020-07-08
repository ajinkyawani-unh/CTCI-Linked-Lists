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
        head.appendToTail(4);
        head.appendToTail(5);
        head.appendToTail(6);
        head.appendToTail(7);
        head.appendToTail(6);

        int choice = 0;
        //choice = new Integer();
        while (choice != 4) {
            System.out.println("\n Please enter your choice");
            System.out.println("\n"
                    + "1. Print Linked List."
                    + "2. Remove Duplicates."
                    + "3. Remove Duplicates Without Using any Buffer."
                    + "4. Exit");
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
                    exit(0);
            }
        }

    }

}
