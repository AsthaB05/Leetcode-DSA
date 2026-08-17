class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    List<Integer> pre=list.get(i-1);
                    row.add(pre.get(j-1)+pre.get(j));
                }
            }
            list.add(row);
        }
        return list;
    }
}