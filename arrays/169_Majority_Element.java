/*
Problem: 169. Majority Element
Pattern: Boyer-Moore Voting Algorithm
Time Complexity: O(n)
Space Complexity: O(1)
*/

class _169_Majority_Element {
    public int majorityElement(int[] nums) {
        int majority=nums[0], lead = 1;
        for(int i = 1 ; i < nums.length ; i++){
            if(majority == nums[i]){
                lead++;
            }else if(lead > 0){
                lead--;
            }else{
                majority = nums[i];
                lead=1;
            }
        }return majority;
    }
}