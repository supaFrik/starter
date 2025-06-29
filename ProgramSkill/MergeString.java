package ProgramSkill;

public class MergeString {
	public static void main(String[] args) {
		
	}
	public String mergeAlternatively(String word1, String word2) {
		int m = word1.length(); //word1 = abc -> 3
		int n = word2.length(); //word2 = qcr -> 3
		StringBuilder result = new StringBuilder();
		int i = 0, j = 0;
		while (i < m || j < n) { 
			if (i < m) { 
				result.append(word1.charAt(i++));
			}
			if (j < n) {
				result.append(word2.charAt(j++));
			}
		}
		return result.toString();
	}
}
