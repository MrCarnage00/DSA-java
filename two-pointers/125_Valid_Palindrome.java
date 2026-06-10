/*
Problem: 125. Valid Palindrome
Pattern: Two Pointers / String Processing
Time Complexity: O(n)
Space Complexity: O(n)
*/

class _125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll(
            "[^a-zA-Z0-9]", "").toLowerCase();
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;   
            }
        }
        return true;
    }
}