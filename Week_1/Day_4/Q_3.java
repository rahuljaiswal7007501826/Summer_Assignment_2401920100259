class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> ans = new ArrayList<>();
        
        int minRow = 0;
        int maxRow = m-1;
        int minCol = 0;
        int maxCol = n-1;

        while(minRow <= maxRow && minCol <= maxCol){

            // Top Row
            for(int i = minCol; i <= maxCol; i++){
                ans.add(matrix[minRow][i]);
            }
            minRow++;

            // Right Column
            for(int i = minRow; i <= maxRow; i++){
                ans.add(matrix[i][maxCol]);
            }
            maxCol--;

            // Bottom Row
            if(minRow <= maxRow){
                    for(int i = maxCol; i >= minCol; i--){
                    ans.add(matrix[maxRow][i]);
                }
                maxRow--;
            }

            // Left Column
            if(minCol <= maxCol){
                    for(int i = maxRow; i >= minRow; i--){
                    ans.add(matrix[i][minCol]);
                }
                minCol++;
            }
        }
        return ans;
    }
}
