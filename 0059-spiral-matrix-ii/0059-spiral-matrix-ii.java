class Solution {
    public int[][] generateMatrix(int n) {
        int[] nums=new int[n*n];
        int num=1;
        for(int i=0; i<n*n; i++){
            nums[i]=num;
            num++;
        }
        List<Integer> list=new ArrayList<>();
        int[][] res=new int[n][n];
        int top=0;
        int bottom=res.length-1;
        int left=0;
        int right=res[0].length-1;
        int k=0;
        while(top<=bottom && left<=right){
            for(int i=top; i<=right; i++){
                res[top][i]=nums[k];
                k++;
            }
            top++;
            for(int i=top; i<=bottom; i++){
                res[i][right]=nums[k];
                k++;
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    res[bottom][i]=nums[k];
                    k++;
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    res[i][left]=nums[k];
                    k++;
                }
                left++;
            }
            
        }
        
        return res;

    }
}