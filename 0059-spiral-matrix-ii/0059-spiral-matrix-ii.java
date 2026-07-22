class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int top=0;
        int bottom=res.length-1;
        int left=0;
        int right=res[0].length-1;
        int k=1;
        while(top<=bottom && left<=right){
            for(int i=top; i<=right; i++){
                res[top][i]=k;
                k++;
            }
            top++;
            for(int i=top; i<=bottom; i++){
                res[i][right]=k;
                k++;
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    res[bottom][i]=k;
                    k++;
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    res[i][left]=k;
                    k++;
                }
                left++;
            }
            
        }
        
        return res;

    }
}