/*
Problem: 11. Container With Most Water
Pattern: Two Pointers
Time Complexity: O(n)
Space Complexity: O(1)
*/

class _11_Container_With_Most_Water{
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxArea = 0;
        while(left<right){
            int width = right-left;
            int currentWaterLevel = Math.min(height[left],height[right]);
            int area = currentWaterLevel*width;
            maxArea = Math.max(maxArea,area);
            
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}