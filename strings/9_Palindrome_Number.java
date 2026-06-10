/*
Problem: 9. Palindrome Number
Pattern: Number Reversal
Time Complexity: O(log n)
Space Complexity: O(1)
*/

class _9_Palindrome_Number{
    public boolean isPalindrome(int x) {
        int y = 0;
        int z = x;
        if (x < 0){
            return false;
        }else{
            while(z > 0){
                y = 10 * y + z % 10;
                z = z / 10;
            }
            return y == x;
        }
    }
}