class Solution {
    public int largestMagicSquare(int[][] grid) {
        int[][] rowsum=new int[grid.length][grid[0].length];
        int[][] colsum=new int[grid.length][grid[0].length];

        for(int i=0; i<grid.length; i++){
            rowsum[i][0]=grid[i][0];
            for(int j=1; j<grid[i].length; j++){
                rowsum[i][j]=grid[i][j]+rowsum[i][j-1];
            }
        }
        for(int j=0; j<grid[0].length; j++){
            colsum[0][j]=grid[0][j];
            for(int i=1; i<grid.length; i++){
                colsum[i][j]=grid[i][j]+colsum[i-1][j];
            }
        }
        for(int side=Math.min(grid.length,grid[0].length); side>=2; side--){
            for(int i=0; i<=grid.length-side; i++){
                for(int j=0; j<=grid[0].length-side; j++){
                    boolean ismagic=true;
                    int target=rowsum[i][j+side-1];
                    if(j>0){
                        target-=rowsum[i][j-1];
                    }
                    for(int r=i+1; r<i+side; r++){
                        int sum=rowsum[r][j+side-1];
                        if(j>0){
                            sum-=rowsum[r][j-1];
                        }
                        if(sum!=target){
                            ismagic=false;
                            break;
                        }
                    }
                    if(!ismagic){
                        continue;
                    }
                    for(int c=j; c<j+side; c++){
                        int sum=colsum[i+side-1][c];
                        if(i>0){
                            sum-=colsum[i-1][c];
                        }
                        if(sum!=target){
                            ismagic=false;
                            break;
                        }
                    }
                    if(!ismagic){
                        continue;
                    }
                    int dia=0;
                    int anti=0;
                    for(int k=0; k<side; k++){
                        dia+=grid[i+k][j+k];
                        anti+=grid[i+k][j+side-1-k];
                    }
                    if(dia==target && anti==target){
                        return side;
                    }
                }
            }
        }
        return 1;
    }
}