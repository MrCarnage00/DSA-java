/*
Problem: 50. Pow(x, n)
Pattern: Fast Exponentiation (Binary Exponentiation)
Time Complexity: O(log n)
Space Complexity: O(1)
*/

class _50_Pow_x_n {
    public double myPow(double x, int n) {

        long power = n;
        if(power < 0){
            x = 1/x;
            power = -power;
        }

        double ans = 1.0;
        while(power > 0){
            if((power&1) == 1){
                ans *= x;
            }
            x *= x;
            power = power>>1;
        }
        return ans;
    }
}