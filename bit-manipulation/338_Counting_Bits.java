/*
Problem: 338. Counting Bits
Pattern: Bit Manipulation (Brute Force)
Time Complexity: O(n log n)
Space Complexity: O(n)
*/

class _338_Counting_Bits {
    public int[] countBits(int n) {
        int[] output = new int[n+1];
        for(int i = 0 ; i <= n ; i++){
            int j = i;
            int count = 0;
            while(j > 0){
                if((j & 1) != 0){
                    count++;
                }
                j = j >> 1;
            }
            output[i] = count;
        }
        return output;
    }
}