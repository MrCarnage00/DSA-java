/*
Problem: 54. Spiral Matrix
Pattern: Matrix Traversal
Time Complexity: O(m*n)
Space Complexity: O(1) excluding output
*/

class _54_Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int startCol = 0; 
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        List<Integer> ans = new ArrayList<>();

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int i = startCol; i <= endCol; i++){
                ans.add(matrix[startRow][i]);
            }
            //right
            for(int j = startRow+1; j <= endRow; j++){
                ans.add(matrix[j][endCol]);
            }
            //bottom
            for(int i = endCol-1; i >= startCol ; i--){
                if(startRow == endRow){
                    break;
                }
                ans.add(matrix[endRow][i]);
            }
            //left
            for(int j = endRow-1; j >= startRow+1 ; j--){
                if(startCol == endCol){
                    break;
                }
                ans.add(matrix[j][startCol]);
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return ans;
    }
}