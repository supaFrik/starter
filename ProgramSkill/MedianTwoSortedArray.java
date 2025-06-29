package ProgramSkill;

public class MedianTwoSortedArray {
	private int p1 = 0, p2 = 0;
	private int getMin(int[] nums1, int[] nums2) {
		if (p1 < nums1.length && p2 < nums2.length) {
			return nums1[p1] < nums2[p2] ? nums1[p1++] : nums2[p2++];
		} else if (p1 < nums1.length) {
			return nums1[p1++];
		} else if (p2 < nums2.length) {
			return nums2[p2++];
		} else
		return -1; 
	}
	public double findMedianSortedArray(int[] nums1, int[] nums2) {
		int m = nums1.length, n = nums2.length;
		if ((m + n) % 2 == 0) {
			for (int i = 0; i < nums1.length; i++) {
				int temp = getMin(nums1, nums2);
			}
			return (double) (getMin(nums1, nums2) + getMin(nums1, nums2)) / 2;
		} else {
			for (int i = 0; i < (m + n) / 2; i++) {
				int tmp = getMin(nums1, nums2);
		}
		return getMin(nums1, nums2);
		}
		}
}
