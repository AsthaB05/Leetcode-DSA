class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if(firstList.length==0 || secondList.length==0){
            return new int[0][0];
        }
        List<int[]> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<firstList.length && j<secondList.length){
            if((firstList[i][0]<=secondList[j][1] && firstList[i][1]>=secondList[j][0])){
                list.add(new int[]{Math.max(firstList[i][0],secondList[j][0]),Math.min(firstList[i][1], secondList[j][1])});
            }
            if(firstList[i][1]<secondList[j][1]){
                i++;
            }else{
                j++;
            }
        }

        int[][] res=new int[list.size()][2];
        for(int k=0; k<list.size(); k++){
            res[k]=list.get(k);
        }
        return res;
    }
}