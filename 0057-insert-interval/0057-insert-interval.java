class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list=new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            list.add(intervals[i]);
        }
        list.add(newInterval);
        list.sort((a,b)-> a[0]-b[0]);
        List<int[]> res=new ArrayList<>();
        int[] current=list.get(0);
        for(int i=1; i<list.size(); i++){
            if(list.get(i)[0]<=current[1]){
                current[1]=Math.max(current[1],list.get(i)[1]);

            }else{
                res.add(current);
                current=list.get(i);
            }
        }
        res.add(current);

        return res.toArray(new int[res.size()][]);

    }
}