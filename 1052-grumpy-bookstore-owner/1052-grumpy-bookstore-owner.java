class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum=0;
        for(int i=0; i<customers.length; i++){
            if(grumpy[i]==0){
                sum+=customers[i];
            }
        }
        int k=minutes;
        int low=0;
        int high=0;
        int max=0;
        int sum2=0;
        while(high<customers.length){
            if(grumpy[high]==1){
                sum2+=customers[high];
            }
            if((high-low+1)<k){
                high++;
            }else{
                max=Math.max(max,sum2);
                if(grumpy[low]==1){
                    sum2-=customers[low];
                }
                low++;
                high++;
            }
            
        }
        return sum+max;
    }
}