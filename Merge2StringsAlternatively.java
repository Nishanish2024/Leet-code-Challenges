package leetcode.challenge;

public class Merge2StringsAlternatively {

	/*
	 * You are given two strings word1 and word2. Merge the strings by adding
	 * letters in alternating order, starting with word1. If a string is longer than
	 * the other, append the additional letters onto the end of the merged string.
	 * 
	 * Return the merged string. Input: word1 = "abc", word2 = "pqr" Output:
	 * "apbqcr" Explanation: The merged string will be merged as so: word1: a b c
	 * word2: p q r merged: a p b q c r
	 */
	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "pqr";
		String mergedStr = mergeAlternately(word1, word2);
		System.out.println("word1:" + word1);
		System.out.println("word2:" + word2);
		System.out.println("Merged String is:" + mergedStr);
	}

	public static String mergeAlternately(String word1, String word2) {
		String Ans = "";
		int a1 = 0, a2 = 0;
		int totalLength = word1.length() + word2.length();

		while (totalLength != 0) {

			if (word1.length() > a1 && word2.length() > a2) {
				Ans = Ans + word1.charAt(a1);
				Ans = Ans + word2.charAt(a2);
				a1 += 1;
				a2 += 1;

			} else if (word1.length() > a1) {
				Ans = Ans + word1.charAt(a1);
				a1 += 1;
			} else if (word2.length() > a2) {
				Ans = Ans + word2.charAt(a2);
				a2 += 1;
			}
			totalLength -= 1;
		}

		return Ans;
	}
}
