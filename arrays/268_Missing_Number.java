/*
Problem: 268. Missing Number
Pattern: Sorting
Time Complexity: O(n log n)
Space Complexity: Depends on sorting implementation
*/

class _268_Missing_Number {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
}