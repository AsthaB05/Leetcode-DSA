class NumMatrix {
    int[][] sum;

    public NumMatrix(int[][] matrix) {
        sum=new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            sum[i][0]=matrix[i][0];
            for(int j=1; j<matrix[0].length; j++){
                sum[i][j]=matrix[i][j]+sum[i][j-1];
            }
        }
        for(int j=0; j<matrix[0].length; j++){
            for(int i=1; i<matrix.length; i++){
                sum[i][j]=sum[i][j]+sum[i-1][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res=sum[row2][col2];
        if(row1==0 && col1==0){
            return res;
        }else if(row1==0){
            res=res-sum[row2][col1-1];
        }else if(col1==0){
            res=res-sum[row1-1][col2];
        }else{
            res=res-sum[row1-1][col2]-sum[row2][col1-1]+sum[row1-1][col1-1];
        }
        return res;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */