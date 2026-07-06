class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count=0;
        boolean[] check=new boolean[intervals.length];
        for(int i=0; i<intervals.length; i++){
            for(int j=i+1; j<intervals.length; j++){
                if(intervals[i][0]<=intervals[j][0] &&
                intervals[i][1]>=intervals[j][1]){
                    check[j]=true;
                }else if(intervals[j][0]<=intervals[i][0] &&
                intervals[j][1]>=intervals[i][1]){
                    check[i]=true;
                }
            }
        }
        for(int i=0; i<intervals.length; i++){
            if(!check[i]){
                count++;
            }
        }
        return count;
    }
}