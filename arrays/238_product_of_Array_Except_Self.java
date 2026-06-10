/*
Problem: 238. Product of Array Except Self
Pattern: Prefix Product + Suffix Product
Time Complexity: O(n)
Space Complexity: O(n)
*/

class _238_Product_of_Array_Except_Self{
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1 ; i < n ; i++){
            prefix[i] = prefix[i-1] * nums[i];
        }
        int[] suffix = new int[n];
        suffix[n-1] = nums[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            suffix[i] = suffix[i+1] * nums[i];
        }
        int[] prdArExSelf = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(i == 0){
                prdArExSelf[i] = suffix[i+1];
            }else if(i == n-1){
                prdArExSelf[n-1] = prefix[n-2];
            }else{
                prdArExSelf[i] = prefix[i-1] * suffix[i+1];
            }
        }
        return prdArExSelf;
    }
}