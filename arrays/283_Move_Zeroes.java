/*
Problem: 283. Move Zeroes
Pattern: Two Pointers (in-place overwrite)
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        for(int num : nums) {
            if(num != 0) {
                nums[insertPos++] = num;
            }
        }
        while(insertPos < nums.length) {
            nums[insertPos++] = 0;
        } 
        return ;
    }
}