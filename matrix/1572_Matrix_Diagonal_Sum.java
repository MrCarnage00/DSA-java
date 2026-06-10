/*
Problem: 1572. Matrix Diagonal Sum
Pattern: Matrix Traversal
Time Complexity: O(n)
Space Complexity: O(1)
*/

class _1572_Matrix_Diagonal_Sum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0 ; i <= mat.length-1 ; i++){
            sum += mat[i][i];
            if( i != mat.length-1-i){
                sum += mat[i][mat.length -1-i];
            }
        }
        return sum;
    }
}