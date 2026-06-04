class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if(m*n != r*c) return mat;

        int[][] res = new int[r][c];

        int[] temp = new int[m*n];

        // given matrix to 1D array
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                temp[n*i + j] = mat[i][j];
            }
        }

        // 1D array to required matrix
        for(int i = 0; i < m*n; i++){
            res[i/c][i%c] = temp[i];
        }
        
        return res;
    }
}
