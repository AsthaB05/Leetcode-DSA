class Solution {
    public long getDescentPeriods(int[] prices) {
        long count=0;
        int low=0;
        int high=1;
        while(high<prices.length){
            if(prices[high-1]-prices[high]==1){
                count+=high-low;
            }else{
                low=high;
            }
            high++;
        }
        return count+prices.length;
    }
}