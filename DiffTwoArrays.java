package leetcode.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given two 0-indexed integer arrays nums1 and nums2,
 *  return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.
 * 
 * Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
 */
public class DiffTwoArrays {
	public static List <Integer> findDifference(List<Integer> l1, List<Integer> l2) {
		 Set<Integer> setOne = new HashSet();
	        Set<Integer> setTwo = new HashSet();
	        for(int x : l1) {
	            setOne.add(x);
	        }
	        for(int x : l2) {
	            setTwo.add(x);
	        }
	        List<Integer> AL1 = new ArrayList(setOne);
	        List<Integer> AL2 = new ArrayList(setTwo);
	        AL1.removeAll(setTwo);
	        AL2.removeAll(setOne);
	        List<Integer> Li = new ArrayList();
	        Li.addAll(AL1);
	        Li.addAll(AL2);
	        return Li;
	}
	
	public static void main(String[] args) {
		Integer[] a1= {2,4,3};
		Integer[] a2= {5,6,4};
		List<Integer> l1= new ArrayList<Integer>(Arrays.asList(a1));
		List<Integer> l2= new ArrayList<Integer>(Arrays.asList(a2));
		List <Integer> Diff = findDifference(l1, l2);
		System.out.println("Input List1:"+ l1);
		System.out.println("Input List2:"+ l2);
		System.out.println("Diff/ unique nos in the List are: "+Diff);
	}
	
	
}

