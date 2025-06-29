package ProgramSkill;

public class LongestSubstring {
//	Given a string s, find the length of the longest substring without duplicate characters.
	public int lengthOfLongestSubstring(String s) {
		int[] charCountingArr = new int[128];
		int maxLength = 0;
		int rightIndex = 0, leftIndex = 0;
		
		while (rightIndex < s.length()) {
			char rightChar = s.charAt(rightIndex);
			charCountingArr[rightChar]++;
			
			while (charCountingArr[rightChar] > 1) {
				char leftChar = s.charAt(leftIndex);
				charCountingArr[leftChar]--;
				leftIndex++;
			}
			
			maxLength = Math.max(maxLength, rightIndex - leftIndex + 1);
		}
		return maxLength;
	}
}
