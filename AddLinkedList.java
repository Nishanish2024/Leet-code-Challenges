package leetcode.challenge;

import java.util.*;

/*
 * In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.

For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
The twin sum is defined as the sum of a node and its twin.
Example 2:


Input: head = [4,2,2,3]
Output: 7
Explanation:
The nodes with twins present in this linked list are:
- ListNode 0 is the twin of node 3 having a twin sum of 4 + 3 = 7.
- ListNode 1 is the twin of node 2 having a twin sum of 2 + 2 = 4.
Thus, the maximum twin sum of the linked list is max(7, 4) = 7. 
 */
	/**
	 * Definition for singly-linked list.
	 * struct ListNode {
	 *     int val;
	 *     ListNode *next;
	 *     ListNode() : val(0), next(nullptr) {}
	 *     ListNode(int x) : val(x), next(nullptr) {}
	 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
	 * };
	 */
public class AddLinkedList {
	//Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; this.next = null;}  
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	
	
	 public static int pairSum(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head;
	        ListNode prev = null;
	        ListNode next;
	        while(fast != null && fast.next != null) {
	            fast = fast.next.next;
	            next = slow.next;
	            slow.next = prev;
	            prev = slow;
	            slow = next;
	        }
	        ListNode start = prev;
	        ListNode mid = slow;
	        int max = 0;
	        while(mid != null) {
	            max = Math.max(max, start.val + mid.val);
	            start = start.next;
	            mid = mid.next;
	        }
	        return max;
	    }
	
	  
	//Represent the head and tail of the singly linked list  
	    public ListNode head = null;  
	    public ListNode tail = null;  
	  
	    //addAtStart() will add a new node to the beginning of the list  
	    public void addAtStart(int data) {  
	        //Create a new node  
	        ListNode newNode = new ListNode(data);  
	  
	        //Checks if the list is empty  
	        if(head == null) {  
	            //If list is empty, both head and tail will point to new node  
	            head = newNode;  
	            tail = newNode;  
	        }  
	        else {  
	            //ListNode temp will point to head  
	            ListNode temp = head;  
	            //newNode will become new head of the list  
	            head = newNode;  
	            //ListNode temp(previous head) will be added after new head  
	            head.next = temp;  
	        }  
	    }  
	  
	    //display() will display all the nodes present in the list  
	    public void display() {  
	        //ListNode current will point to head  
	        ListNode current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        //System.out.println("Adding nodes to the start of the list: ");  
	        while(current != null) {  
	            //Prints each node by incrementing pointer  
	            System.out.print(current.val + " ");  
	            current = current.next;  
	        }  
	        System.out.println();  
	    }  
	  
	    public static void main(String[] args) {  
	  
	    	AddLinkedList sList = new AddLinkedList();  
	  
	        //Adding 1 to the list  
	        sList.addAtStart(1);  
	        sList.display();  
	  
	        //Adding 2 to the list  
	        sList.addAtStart(2);  
	        sList.display();  
	  
	        //Adding 3 to the list  
	        sList.addAtStart(3);  
	        sList.display();  
	  
	        //Adding 4 to the list  
	        sList.addAtStart(4);  
	        sList.display();  
	       // System.out.println("Linked list: " + sList.head); 
	        //Adding the twin nodes
	        int sum = pairSum(sList.head);
	        System.out.println("The twin node - sum is: " + sum);
	    }  
}

