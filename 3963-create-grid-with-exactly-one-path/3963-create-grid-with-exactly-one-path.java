class Solution {
    public String[] createGrid(int m, int n) {
        char[][] res=new char[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(res[i],'#');
        }
        for(int i=0; i<m; i++){
            res[i][0]='.';
        }
        Arrays.fill(res[m-1],'.');
        String[] s=new String[m];
        for(int i=0; i<m; i++){
            s[i]=new String(res[i]);
        }
        return s;
    }
}