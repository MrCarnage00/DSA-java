// Brute force: check every pair -> O(n^2) (TLE)
// Optimized: sort array and check adjacent elements -> O(n log n)

class _217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}