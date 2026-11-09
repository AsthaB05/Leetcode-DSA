class Solution {
    public int minFlips(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int rowC=0;
        int colC=0;
        for(int i=0; i<m; i++){
            int start=0;
            int end=n-1;
            while(start<end){
                if(grid[i][start]!=grid[i][end]){
                    rowC++;
                }
                start++;
                end--;
            }
        }
        for(int i=0; i<n; i++){
            int start=0;
            int end=m-1;
            while(start<end){
                if(grid[start][i]!=grid[end][i]){
                    colC++;
                }
                start++;
                end--;
            }
        }
        if(rowC<colC){
            return rowC;
        }
        return colC;
    }
}