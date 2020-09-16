//https://leetcode.com/problems/largest-1-bordered-square/

class Solution {
    public int largest1BorderedSquare(int[][] grid) {
        if (grid == null || grid.length < 1 || grid[0].length < 1) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] rightToLeft = new int[rows][cols];
        int[][] bottomToTop = new int[rows][cols];
        int max = 0;
        //Making box
        for (int i = 0; i < rows; i++) {
            rightToLeft[i][cols - 1] = grid[i][cols - 1];
        }
        for (int i = 0; i < rows; i++) {
            for (int j = cols - 2; j >= 0; j--) {
                if (grid[i][j] == 0) {
                    rightToLeft[i][j] = 0;
                } else{
                    rightToLeft[i][j] = rightToLeft[i][j + 1] + 1;
                }
            }
        }
        for (int j = 0; j < cols; j++) {
            bottomToTop[rows - 1][j] = grid[rows - 1][j];
        }
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    bottomToTop[i][j] = 0;
                } else {
                    bottomToTop[i][j] = bottomToTop[i + 1][j] + 1;
                }
            }
        }
        //Checking for valid boxes
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int n = Math.min(rightToLeft[i][j], bottomToTop[i][j]);
                for(int k = n; k > 0; k--) {
                    if (rightToLeft[i + k - 1][j] >= k && bottomToTop[i][j + k - 1] >= k){
                        max = Math.max(max, k);
                        break;
                    }
                }
            }
        }
        return max * max;
    }
}