class Solution {
    public int diagonalSum(int[][] mat) {
       
        // accumalative variable
        int sum = 0;
        
        //int num_rows = mat.length;
        int sq = mat[0].length;
        
        // primary diagonal
        for (int i = 0; i < sq; i++) {
            
            // case where the square matrix is odd
            if ((sq % 2 == 1) && (i == ((sq/2)+1)-1)) {
                sum += mat[i][i];
            }
            // all other cases
            else {
                sum += mat[i][i];
                sum += mat[i][(sq-1)-i];
            }
        }
        
        // return sum
        return sum;
    }
}
