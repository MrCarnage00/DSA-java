/*
Problem: 167. Two Sum II - Input Array Is Sorted
Pattern: Two Pointers
Time Complexity: O(n)
Space Complexity: O(1)
*/

class _167_Two_Sum_II_Input_Array_Is_Sorted{
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int[] req = new int[2];
        int right = numbers.length-1;
        
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                req[0] = left + 1;
                req[1] = right + 1;
                return req;
            }else if(sum > target){
                right--;
            }else{
                left++;
            }
        }
        return req;
    }
}