class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end=1;
        for(int i=0; i<piles.length; i++){
            end=Math.max(end, piles[i]);
        }
        while(start<end){
            int mid=start+(end-start)/2;
            if(isTrue(mid, piles, h)){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    public boolean isTrue(int mid, int[] piles, int h){
        int hr=0;
        for(int i=0; i<piles.length; i++){
            hr+=piles[i]/mid;
            if((piles[i]%mid)!=0){
                hr++;
            }
        }
        if(hr<=h){
            return true;
        }
        return false;
    }
}