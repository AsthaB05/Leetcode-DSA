class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int m=grid.length;
        int n=grid[0].length;
        k = k % (m * n);
        int x=k;
        for(int i=m-1; i>=0; i--){
            if(x==0){
                break;
            }
            for(int j=n-1; j>=0; j--){
                if(x==0){
                    break;
                }
                list.add(grid[i][j]);
                x--;
            }
        }
        Collections.reverse(list);
        int all=m*n;
        int last=all-k;;
        for(int i=0; i<m; i++){
            if(last==0){
                break;
            }
            for(int j=0; j<n; j++){
                if(last==0){
                    break;
                }
                list.add(grid[i][j]);
                last--;
            }
        }
        int size=n;
        for(int i=0; i<list.size(); i+=size){
            List<Integer> temp=new ArrayList<>();
            for(int j=i; j<i+size; j++){
                temp.add(list.get(j));
            }
            res.add(temp);
        }
        return res;

    }
}