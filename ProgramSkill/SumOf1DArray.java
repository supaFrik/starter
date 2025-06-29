package ProgramSkill;

public class SumOf1DArray {
	public int[] runningSum(int[] nums) {
		int[] results = new int[nums.length]; // [1, 2, 3, 4]
		results[0] = nums[0]; // result : 1 = nums : 1
		for (int i = 1; i < nums.length; i++) { // i < 4
			results[i] = nums[i] + results[i - 1]; // 
		}
		return results;
	}
}
