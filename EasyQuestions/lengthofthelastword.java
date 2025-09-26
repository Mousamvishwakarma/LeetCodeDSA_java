// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.
// Example 1:
// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.

public class  lengthofthelastword {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        int lastSpaceIndex = trimmed.lastIndexOf(' ');
        return trimmed.length() - lastSpaceIndex - 1;
    }
    public static void main(String[] args) {
        lengthofthelastword sol = new lengthofthelastword();
        String input = "Hello sir ";
        int result = sol.lengthOfLastWord(input);
        System.out.println("Length of the last word: " + result);
    }
}
