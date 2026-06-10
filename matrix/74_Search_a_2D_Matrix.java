/*
Accepted using top-right corner search.
Time Complexity: O(m + n)

Note:
Problem 74 can also be solved using binary search
in O(log(m*n)).
*/

class _74_Search_a_2D_matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int i = 0;
        int j = m-1;

        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }else if(target > matrix[i][j]){
                i++;
            }else if(target < matrix[i][j]){
                j--;
            }
        }
        return false;
    }
}