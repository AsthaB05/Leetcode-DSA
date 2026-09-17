class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] sum=new int[mat.length][mat[0].length];
        for(int i=0; i<mat.length; i++){
            sum[i][0]=mat[i][0];
            for(int j=1; j<mat[0].length; j++){
                sum[i][j]=mat[i][j]+sum[i][j-1];
            }
        }
        for(int j=0; j<mat[0].length; j++){
            for(int i=1; i<mat.length; i++){
                sum[i][j]=sum[i][j]+sum[i-1][j];
            }
        }
        int[][] res=new int[mat.length][mat[0].length];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                int top=Math.max(0,i-k);
                int bottom=Math.min(mat.length-1,i+k);
                int left=Math.max(0,j-k);
                int right=Math.min(mat[i].length-1,j+k);
                if(top==0 && left==0){
                    res[i][j]=sum[bottom][right];
                }else if(top==0){
                    res[i][j]=sum[bottom][right]-sum[bottom][left-1];
                }else if(left==0){
                    res[i][j]=sum[bottom][right]-sum[top-1][right];
                }else{
                    res[i][j]=sum[bottom][right]-sum[top-1][right]-sum[bottom][left-1]+sum[top-1][left-1];
                }  
            }
        }
        return res;
    }
}