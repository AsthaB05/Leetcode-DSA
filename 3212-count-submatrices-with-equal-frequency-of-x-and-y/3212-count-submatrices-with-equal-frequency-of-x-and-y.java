class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] xcount=new int[n][m];
        int[][] ycount=new int[n][m];
        for(int i=0; i<n; i++){
            if(grid[i][0]=='X'){
                xcount[i][0]=1;
            }else if(grid[i][0]=='Y'){
                ycount[i][0]=1;
            }
            for(int j=1; j<m; j++){
                xcount[i][j]=xcount[i][j-1];
                ycount[i][j]=ycount[i][j-1];
                if(grid[i][j]=='X'){
                    xcount[i][j]++;
                }else if(grid[i][j]=='Y'){
                    ycount[i][j]++;
                }
                 
            }
        }
        for(int j=0; j<m; j++){
            for(int i=1; i<n; i++){
                xcount[i][j]+=xcount[i-1][j];
                ycount[i][j]+=ycount[i-1][j];
            }
        }
        int res=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(xcount[i][j]==ycount[i][j] && xcount[i][j] > 0){
                    res++;
                }
            }
        }
        return res;
    }
}