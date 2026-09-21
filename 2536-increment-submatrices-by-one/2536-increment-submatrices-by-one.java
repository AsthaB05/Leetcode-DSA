class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] res=new int[n][n];
        for(int k=0; k<queries.length; k++){
            int row1=queries[k][0];
            int row2=queries[k][2];
            int col1=queries[k][1];
            int col2=queries[k][3];
            for(int i=row1; i<=row2; i++){
                res[i][col1]+=1;
                if((col2+1)<n){
                    res[i][col2+1]-=1;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                res[i][j]+=res[i][j-1];
            }
        }
        return res;
    }
}