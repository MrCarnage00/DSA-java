/*
Approach 1: Prefix/Suffix Arrays
Time: O(n)
Space: O(n)

Approach 2: Two Pointers (Optimal)
Time: O(n)
Space: O(1)
*/

class _42_Trapping_Rain_Water{
    public int trap(int[] height) {
        int trappedWater = 0;
        int n = height.length;
        
        int left = 0;
        int right = n-1;

        int leftMax = 0;
        int rightMax = 0;

        while(left < right){
            if(height[left] < height[right]){
                if(height[left] > leftMax ){
                    leftMax = height[left];
                }else{
                    trappedWater += leftMax - height[left];
                }
                left++;
            }else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }else{
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }
        return trappedWater;
    }
}