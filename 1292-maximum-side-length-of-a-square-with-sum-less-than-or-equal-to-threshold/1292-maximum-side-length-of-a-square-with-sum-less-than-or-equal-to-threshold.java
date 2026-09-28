class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        for(int i=0; i<mat.length; i++){
            for(int j=1; j<mat[i].length; j++){
                mat[i][j]+=mat[i][j-1];
            }
        }
        for(int j=0; j<mat[0].length; j++){
            for(int i=1; i<mat.length; i++){
                mat[i][j]+=mat[i-1][j];
            }
        }
        int best=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                int r=mat.length-i;
                int c=mat[0].length-j;
                for(int k=0; k<Math.min(r,c); k++){
                    int sum=mat[i+k][j+k];
                    if(i>0 && j>0){
                        sum=sum-mat[i-1][j+k]-mat[i+k][j-1]+mat[i-1][j-1];
                    }else if(i>0){
                        sum=sum-mat[i-1][j+k];
                    }else if(j>0){
                        sum=sum-mat[i+k][j-1];
                    }
                    if(sum<=threshold){
                        best=Math.max(best,k+1);
                    }else{
                        break;
                    }
                }
            }
        }
        return best;
    }
}