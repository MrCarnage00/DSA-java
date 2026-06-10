/*
Problem: 58. Length of Last Word
Pattern: String Traversal (Reverse Scan)
Time Complexity: O(n)
Space Complexity: O(1)
*/

class _58_Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
       int i = s.length() - 1;
       while(i >= 0 && s.charAt(i) == ' '){
        i--;
       }
       int j = i;
       while(i >= 0 && s.charAt(i) != ' '){
            i--;
       }
       return j-i;
    }
}