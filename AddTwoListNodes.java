package leetcode.challenge;

import java.util.*;

public class AddTwoListNodes {
	/*
	 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] a1= {2,4,3};
		Integer[] a2= {5,6,4};
		List<Integer> l1= new ArrayList<Integer>(Arrays.asList(a1));
		List<Integer> l2= new ArrayList<Integer>(Arrays.asList(a2));
		addTwoNumbers(l1, l2);
	}

	
		public static List addTwoNumbers(List l1, List l2) {
			List<Integer> rev1= new ArrayList<Integer>();
			System.out.println("l1="+ l1 +" size= "+l1.size());
		//	rev1 = Collections.reverse(Arrays.asList(l1));
			System.out.println("rev l1 ="+l1);
			/*int size1=l1.size()-1;
			for(int i=size1;  i<= 0; i--) {
				System.out.println("size1 ="+size1);
				rev1.add(i);
			}
			System.out.println("rev1 ="+rev1);
			*/
			return l2;
		        
		    
		}
	
}
