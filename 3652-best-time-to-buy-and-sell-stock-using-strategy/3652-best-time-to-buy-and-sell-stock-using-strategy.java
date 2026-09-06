class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        long[] profit=new long[prices.length];
        long Opro=0;
        for(int i=0; i<prices.length; i++){
            profit[i]=(long)prices[i]*strategy[i];
            Opro+=profit[i];
        }
        long owpro=0;
        long mwpro=0;
        long max=0;
        int low=0;
        int high=0;
        while(high<prices.length){
            owpro+=profit[high];
            if((high-low+1)>k/2){
                mwpro+=prices[high];
            }
            if((high-low+1)>k){
                owpro-=profit[low];
                mwpro-=prices[low+k/2];
                low++;
            }
            if((high-low+1)==k){
                max=Math.max(max,mwpro-owpro);
            }
            high++;
        }
        return Opro+max;

    }
}