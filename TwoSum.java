package leetcode.challenge;
import java.util.*;
import java.io.*;

public class TwoSum {

		/*
		 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
		
		You may assume that each input would have exactly one solution, and you may not use the same element twice.
		
		You can return the answer in any order.
		
		 
		
		Example 1:
		
		Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
		Example 2:
		
		Input: nums = [3,2,4], target = 6
		Output: [1,2]	
		 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> nums = new Vector<Integer>() ;
		nums.add(3);
		nums.add(2);
		nums.add(4);
	
		int target = 6;
		System.out.println("nums = "+ nums + " target="+ target);
		twoSum(nums, target);
	}

	public static Vector<Integer> twoSum(Vector<Integer> nums, int target) {
		int sum=0;
		Vector<Integer> indices = new Vector <Integer>();
        for(int i=0; i<nums.size(); i++){
            for(int j= i+1; j< nums.size(); j++){
                sum=nums.get(i)+nums.get(j);
                if(sum==target){
                    indices.add(i);
                    indices.add(j);
                 }
            }
           
        }
        System.out.println("indices= "+indices);
        return indices;
	}
	

}
